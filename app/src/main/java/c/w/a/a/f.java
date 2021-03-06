/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  c.h.b.g
 *  c.h.d.l.a
 */
package c.w.a.a;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import c.h.b.g;
import c.h.d.l.a;

public abstract class f
extends Drawable
implements a {
    public Drawable e;

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.e;
        if (drawable != null && Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.clearColorFilter();
            return;
        }
        super.clearColorFilter();
    }

    public Drawable getCurrent() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public boolean onLevelChange(int n2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setLevel(n2);
        }
        return super.onLevelChange(n2);
    }

    public void setChangingConfigurations(int n2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setChangingConfigurations(n2);
            return;
        }
        super.setChangingConfigurations(n2);
    }

    public void setColorFilter(int n2, PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(n2, mode);
            return;
        }
        super.setColorFilter(n2, mode);
    }

    public void setFilterBitmap(boolean bl) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setFilterBitmap(bl);
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.e;
        if (drawable != null) {
            g.O((Drawable)drawable, (float)f2, (float)f3);
        }
    }

    public void setHotspotBounds(int n2, int n3, int n4, int n5) {
        Drawable drawable = this.e;
        if (drawable != null) {
            g.P((Drawable)drawable, (int)n2, (int)n3, (int)n4, (int)n5);
        }
    }

    public boolean setState(int[] arrn) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(arrn);
        }
        return super.setState(arrn);
    }
}

