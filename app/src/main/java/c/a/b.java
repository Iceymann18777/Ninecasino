/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package c.a;

import c.a.a;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class b {
    public boolean a;
    public CopyOnWriteArrayList<a> b = new CopyOnWriteArrayList();

    public b(boolean bl) {
        this.a = bl;
    }

    public abstract void a();
}

