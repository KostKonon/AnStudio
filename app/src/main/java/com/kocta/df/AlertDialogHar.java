package com.kocta.df;


import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.annotation.NonNull;

public class AlertDialogHar extends DialogFragment {

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        return builder
                .setTitle("Зачем нужны характеристики")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage("Это Сила, Ловкость, Телосложение, Интеллект, Харизма и Мудрость. " +
                        "\nЭти шесть характеристик предназначены для суммирования физических и умственных способностей любого персонажа.\n")
                .setCancelable(false)
                .setPositiveButton("OK", null)
                .create();
    }

}
