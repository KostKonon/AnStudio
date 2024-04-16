package com.kocta.df;


import static android.app.PendingIntent.getActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.annotation.NonNull;

public class AlertDialogSkills extends DialogFragment {
    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        return builder
                /*.setTitle("")*/
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage("Навык - исчисляемая характеристика персонажа, показывающая его владение какой-либо областью " +
                        "деятельности или знаний."+"\n\nЯзык - Ваша раса указывает языки, на которых ваш" +
                        " персонаж может говорить по умолчанию, а предыстория может дать ещё несколько языков на выбор.")
                .setCancelable(false)
                .setPositiveButton("OK", null)
                .create();
    }
}
