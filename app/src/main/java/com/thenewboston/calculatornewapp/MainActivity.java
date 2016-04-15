/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.thenewboston.calculatornewapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/*
* Construct onButtonClick method to show us the result of the operation
*/

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // We create onButtonClick method for the sum button
    public void onButtonClick(View v) {

        Button myButton = (Button) findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener(){
                                        @Override
                                        … onClick(){
                                            Toast toast=Toast.makeText(getApplicationContext(), "My Results are:" + sum,Toast.LENGTH_SHORT);
                                            toast.setMargin(50,50);
                                            toast.show();
                                        }
        }




        EditText FirstNumber = (EditText)findViewById(R.id.editText);
        EditText SecondNumber = (EditText)findViewById(R.id.editText2);
        TextView Result = (TextView)findViewById(R.id.textView);
        int num1 = Integer.parseInt(FirstNumber.getText().toString());
        int num2 = Integer.parseInt(SecondNumber.getText().toString());
        int sum = num1 + num2; // We make here the sum, an integer
        Result.setText(Integer.toString(sum)); // The place where we have the result
    }
}
