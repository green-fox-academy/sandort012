table 50103 ExamResult
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;
        }

        field(2; StudentId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Student.Id;
        }

        field(8; StudentName; Text[100])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Student.Name where(Id = field(StudentId)));
        }

        field(3; StudentScore; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                CalcFields(MaxExamScore);
                if Rec.StudentScore > MaxExamScore then begin
                    FieldError(Rec.StudentScore, 'Student can not be too clever.');
                end;
            end;
        }

        field(4; ExamId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Exam.Id;
        }

        field(5; ExamDate; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Exam.DueDate where(Id = field(ExamId)));
        }

        field(6; Attended; Boolean)
        {
            DataClassification = ToBeClassified;
        }

        field(7; MaxExamScore; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Exam.MaxScore where(Id = field(ExamId)));
        }
    }

    keys
    {
        key(PK; Id)
        {
            Clustered = true;
        }
    }

    trigger OnInsert()
    begin
        Validate(Rec.StudentScore);
    end;

    trigger OnModify()
    begin
        Validate(Rec.StudentScore);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}