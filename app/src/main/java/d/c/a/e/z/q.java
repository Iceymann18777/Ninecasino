/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.google.android.material.textfield.TextInputLayout
 *  java.lang.CharSequence
 */
package d.c.a.e.z;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import d.c.a.e.z.m;

public class q
extends m {
    public q(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    @Override
    public void a() {
        this.a.setEndIconOnClickListener(null);
        this.a.setEndIconDrawable(null);
        this.a.setEndIconContentDescription(null);
    }
}

