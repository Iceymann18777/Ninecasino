/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.widget.Checkable
 *  android.widget.FrameLayout
 *  androidx.cardview.widget.CardView
 *  c.b.d.a.a
 *  java.lang.CharSequence
 *  java.lang.Deprecated
 *  java.lang.Object
 */
package d.c.a.e.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import d.c.a.e.w.j;
import d.c.a.e.w.n;

public class a
extends CardView
implements Checkable,
n {
    public static final int[] p = new int[]{16842911};
    public static final int[] q = new int[]{16842912};
    public static final int[] r = new int[]{2130903735};
    public boolean n;
    public a o;

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public j getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    public boolean isChecked() {
        return false;
    }

    public void onAttachedToWindow() {
        FrameLayout.super.onAttachedToWindow();
        throw null;
    }

    public int[] onCreateDrawableState(int n2) {
        int[] arrn = FrameLayout.super.onCreateDrawableState(n2 + 3);
        if (this.isChecked()) {
            FrameLayout.mergeDrawableStates(arrn, q);
        }
        if (this.n) {
            FrameLayout.mergeDrawableStates(arrn, r);
        }
        return arrn;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        FrameLayout.super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        FrameLayout.super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(false);
        accessibilityNodeInfo.setClickable(this.isClickable());
        accessibilityNodeInfo.setChecked(this.isChecked());
    }

    public void onMeasure(int n2, int n3) {
        super.onMeasure(n2, n3);
        this.getMeasuredWidth();
        this.getMeasuredHeight();
        throw null;
    }

    public void setBackground(Drawable drawable) {
        this.setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundInternal(Drawable drawable) {
        FrameLayout.super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int n2) {
        ColorStateList.valueOf(n2);
        throw null;
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean bl) {
        throw null;
    }

    public void setChecked(boolean bl) {
        if (bl) {
            this.toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconResource(int n2) {
        c.b.d.a.a.b((Context)this.getContext(), (int)n2);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setClickable(boolean bl) {
        FrameLayout.super.setClickable(bl);
    }

    public void setDragged(boolean bl) {
        if (this.n != bl) {
            this.n = bl;
            this.refreshDrawableState();
            if (Build.VERSION.SDK_INT <= 26) {
                this.invalidate();
                return;
            }
            throw null;
        }
    }

    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        throw null;
    }

    public void setOnCheckedChangeListener(a a2) {
        this.o = a2;
    }

    public void setPreventCornerOverlap(boolean bl) {
        super.setPreventCornerOverlap(bl);
        throw null;
    }

    public void setProgress(float f2) {
        throw null;
    }

    public void setRadius(float f2) {
        super.setRadius(f2);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int n2) {
        c.b.d.a.a.a((Context)this.getContext(), (int)n2);
        throw null;
    }

    @Override
    public void setShapeAppearanceModel(j j2) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.setClipToOutline(j2.d(this.getBoundsAsRectF()));
        }
        throw null;
    }

    public void setStrokeColor(int n2) {
        ColorStateList.valueOf(n2);
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeWidth(int n2) {
        throw null;
    }

    public void setUseCompatPadding(boolean bl) {
        super.setUseCompatPadding(bl);
        throw null;
    }

    public void toggle() {
    }

}

