// Generated by view binder compiler. Do not edit!
package com.example.sportoclock.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sportoclock.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogConfirmationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton acceptButton;

  @NonNull
  public final TextView confirmationMessage;

  private DialogConfirmationBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton acceptButton, @NonNull TextView confirmationMessage) {
    this.rootView = rootView;
    this.acceptButton = acceptButton;
    this.confirmationMessage = confirmationMessage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogConfirmationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogConfirmationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_confirmation, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogConfirmationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.acceptButton;
      MaterialButton acceptButton = ViewBindings.findChildViewById(rootView, id);
      if (acceptButton == null) {
        break missingId;
      }

      id = R.id.confirmationMessage;
      TextView confirmationMessage = ViewBindings.findChildViewById(rootView, id);
      if (confirmationMessage == null) {
        break missingId;
      }

      return new DialogConfirmationBinding((ConstraintLayout) rootView, acceptButton,
          confirmationMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
