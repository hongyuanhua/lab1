package eecs1022.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Lab1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);
    }

    private void setContentsOfTextView(int id, String newContents){
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    private String getInputOfTextField(int id){
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }
    private String getItemSelected(int id){
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }

    public void compute (View view){
        String textName = getInputOfTextField(R.id.inputName);
        String textWeight = getInputOfTextField(R.id.inputWeight);
        String textHeight = getInputOfTextField(R.id.inputHeight);
        String selectedItem1=getItemSelected(R.id.spinner1);
        String selectedItem2=getItemSelected(R.id.spinner2);

        double weight = Double.parseDouble(textWeight);
        double height = Double.parseDouble(textHeight);

        if (selectedItem1.equals("kilograms") && selectedItem2.equals("centimeters")){
            double bmi =weight/((height/100)*(height/100));
            if (bmi<18.5){
                String health = " Underweight";
                String bmi1=String.format("%.2f", bmi);
                String contents =textName+"\'s BMI is "+bmi1+"\n"+textName+" is"+health;
                setContentsOfTextView(R.id.labelAnswer,contents);
            }else if (bmi>=18.5 && bmi<25.0){
                String health = " Normal";
                String bmi1=String.format("%.2f", bmi);
                String contents =textName+"\'s BMI is "+bmi1+"\n"+textName+" is"+health;
                setContentsOfTextView(R.id.labelAnswer,contents);
            }else if (bmi>=25.0 && bmi<30.0){
                String health = " Overweight";
                String bmi1=String.format("%.2f", bmi);
                String contents =textName+"\'s BMI is "+bmi1+"\n"+textName+" is"+health;
                setContentsOfTextView(R.id.labelAnswer,contents);
            }else if (bmi>=30){
                String health = " Obese";
                String bmi1=String.format("%.2f", bmi);
                String contents =textName+"\'s BMI is "+bmi1+"\n"+textName+" is"+health;
                setContentsOfTextView(R.id.labelAnswer,contents);
            }

        }else if (selectedItem1.equals("kilograms") && selectedItem2.equals("inches")){
            double bmi =weight/((height*0.0254)*(height*0.0254));
            if (bmi<18.5){
                String health = " Underweight";
                String bmi1=String.format("%.2f", bmi);
                String contents =textName+"\'s BMI is "+bmi1+"\n"+textName+" is"+health;
                setContentsOfTextView(R.id.labelAnswer,contents);
            }else if (bmi>=18.5 && bmi<25.0){
                String health = " Normal";
                String bmi1=String.format("%.2f", bmi);
                String contents =textName+"\'s BMI is "+bmi1+"\n"+textName+" is"+health;
                setContentsOfTextView(R.id.labelAnswer,contents);
            }else if (bmi>=25.0 && bmi<30.0){
                String health = " Overweight";
                String bmi1=String.format("%.2f", bmi);
                String contents =textName+"\'s BMI is "+bmi1+"\n"+textName+" is"+health;
                setContentsOfTextView(R.id.labelAnswer,contents);
            }else if (bmi>=30){
                String health = " Obese";
                String bmi1=String.format("%.2f", bmi);
                String contents =textName+"\'s BMI is "+bmi1+"\n"+textName+" is"+health;
                setContentsOfTextView(R.id.labelAnswer,contents);
            }
        }else if (selectedItem1.equals("pounds") && selectedItem2.equals("centimeters")){
            double bmi =(weight*0.45359237)/((height/100)*(height/100));
            if (bmi<18.5){
                String health = " Underweight";
                String bmi1=String.format("%.2f", bmi);
                String contents =textName+"\'s BMI is "+bmi1+"\n"+textName+" is"+health;
                setContentsOfTextView(R.id.labelAnswer,contents);
            }else if (bmi>=18.5 && bmi<25.0){
                String health = " Normal";
                String bmi1=String.format("%.2f", bmi);
                String contents =textName+"\'s BMI is "+bmi1+"\n"+textName+" is"+health;
                setContentsOfTextView(R.id.labelAnswer,contents);
            }else if (bmi>=25.0 && bmi<30.0){
                String health = " Overweight";
                String bmi1=String.format("%.2f", bmi);
                String contents =textName+"\'s BMI is "+bmi1+"\n"+textName+" is"+health;
                setContentsOfTextView(R.id.labelAnswer,contents);
            }else if (bmi>=30){
                String health = " Obese";
                String bmi1=String.format("%.2f", bmi);
                String contents =textName+"\'s BMI is "+bmi1+"\n"+textName+" is"+health;
                setContentsOfTextView(R.id.labelAnswer,contents);
            }
        }else if (selectedItem1.equals("pounds") && selectedItem2.equals("inches")){
            double bmi =(weight*0.45359237)/((height*0.0254)*(height*0.0254));
            if (bmi<18.5){
                String health = " Underweight";
                String bmi1=String.format("%.2f", bmi);
                String contents =textName+"\'s BMI is "+bmi1+"\n"+textName+" is"+health;
                setContentsOfTextView(R.id.labelAnswer,contents);
            }else if (bmi>=18.5 && bmi<25.0){
                String health = " Normal";
                String bmi1=String.format("%.2f", bmi);
                String contents =textName+"\'s BMI is "+bmi1+"\n"+textName+" is"+health;
                setContentsOfTextView(R.id.labelAnswer,contents);
            }else if (bmi>=25.0 && bmi<30.0){
                String health = " Overweight";
                String bmi1=String.format("%.2f", bmi);
                String contents =textName+"\'s BMI is "+bmi1+"\n"+textName+" is"+health;
                setContentsOfTextView(R.id.labelAnswer,contents);
            }else if (bmi>=30){
                String health = " Obese";
                String bmi1=String.format("%.2f", bmi);
                String contents =textName+"\'s BMI is "+bmi1+"\n"+textName+" is"+health;
                setContentsOfTextView(R.id.labelAnswer,contents);
            }
        }




    }
}
