package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ev4  reason: default package */
/* loaded from: classes.dex */
public final class ev4 {
    public final ArrayList a = new ArrayList();
    public final ll6 b;
    public x13 c;
    public x13 d;
    public int e;
    public boolean f;

    public ev4(ll6 ll6Var, ArrayList arrayList) {
        x13 x13Var = x13.e;
        this.c = x13Var;
        this.d = x13Var;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = ll6Var.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            x13 x13Var2 = ll6Var.c;
            x13 x13Var3 = ll6Var.d;
            this.c = x13Var2;
            this.d = x13Var3;
            c();
            b(ll6Var.e);
        }
        this.b = ll6Var;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zq0 zq0Var = (zq0) list.get(i);
            zq0Var.getClass();
            if (true == z) {
                ev4 ev4Var = zq0Var.e;
                if (ev4Var == null) {
                    zq0Var.e = this;
                    this.a.add(zq0Var);
                } else {
                    throw new IllegalStateException(zq0Var + " (" + (i + 1) + "/" + size + ") is already controlled by " + ev4Var + " but is still added to " + this);
                }
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zq0 zq0Var = (zq0) arrayList.get(size);
            if (!zq0Var.g) {
                ColorDrawable colorDrawable = zq0Var.f;
                if (zq0Var.h != i) {
                    zq0Var.h = i;
                    colorDrawable.setColor(i);
                    dv4 dv4Var = zq0Var.b;
                    dv4Var.e = colorDrawable;
                    ci3 ci3Var = dv4Var.i;
                    if (ci3Var != null) {
                        ((View) ci3Var.L).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i;
        x13 c;
        boolean z;
        float f;
        ArrayList arrayList = this.a;
        x13 x13Var = x13.e;
        x13 x13Var2 = x13Var;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zq0 zq0Var = (zq0) arrayList.get(size);
            x13 x13Var3 = this.c;
            x13 x13Var4 = this.d;
            zq0Var.c = x13Var3;
            dv4 dv4Var = zq0Var.b;
            zq0Var.d = x13Var4;
            if (!dv4Var.c.equals(x13Var2)) {
                dv4Var.c = x13Var2;
                ci3 ci3Var = dv4Var.i;
                if (ci3Var != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ci3Var.B;
                    layoutParams.leftMargin = x13Var2.a;
                    layoutParams.topMargin = x13Var2.b;
                    layoutParams.rightMargin = x13Var2.c;
                    layoutParams.bottomMargin = x13Var2.d;
                    ((View) ci3Var.L).setLayoutParams(layoutParams);
                }
            }
            int i2 = zq0Var.a;
            int i3 = 8;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 != 8) {
                            c = x13Var;
                            i = 0;
                        } else {
                            i = zq0Var.c.d;
                            int i4 = zq0Var.d.d;
                            if (dv4Var.b != i4) {
                                dv4Var.b = i4;
                                ci3 ci3Var2 = dv4Var.i;
                                if (ci3Var2 != null) {
                                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ci3Var2.B;
                                    layoutParams2.height = i4;
                                    ((View) ci3Var2.L).setLayoutParams(layoutParams2);
                                }
                            }
                            c = x13.c(0, 0, 0, i);
                        }
                    } else {
                        i = zq0Var.c.c;
                        int i5 = zq0Var.d.c;
                        if (dv4Var.a != i5) {
                            dv4Var.a = i5;
                            ci3 ci3Var3 = dv4Var.i;
                            if (ci3Var3 != null) {
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ci3Var3.B;
                                layoutParams3.width = i5;
                                ((View) ci3Var3.L).setLayoutParams(layoutParams3);
                            }
                        }
                        c = x13.c(0, 0, i, 0);
                    }
                } else {
                    i = zq0Var.c.b;
                    int i6 = zq0Var.d.b;
                    if (dv4Var.b != i6) {
                        dv4Var.b = i6;
                        ci3 ci3Var4 = dv4Var.i;
                        if (ci3Var4 != null) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ci3Var4.B;
                            layoutParams4.height = i6;
                            ((View) ci3Var4.L).setLayoutParams(layoutParams4);
                        }
                    }
                    c = x13.c(0, i, 0, 0);
                }
            } else {
                i = zq0Var.c.a;
                int i7 = zq0Var.d.a;
                if (dv4Var.a != i7) {
                    dv4Var.a = i7;
                    ci3 ci3Var5 = dv4Var.i;
                    if (ci3Var5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ci3Var5.B;
                        layoutParams5.width = i7;
                        ((View) ci3Var5.L).setLayoutParams(layoutParams5);
                    }
                }
                c = x13.c(i, 0, 0, 0);
            }
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (dv4Var.d != z) {
                dv4Var.d = z;
                ci3 ci3Var6 = dv4Var.i;
                if (ci3Var6 != null) {
                    View view = (View) ci3Var6.L;
                    if (z) {
                        i3 = 0;
                    }
                    view.setVisibility(i3);
                }
            }
            float f2 = RecyclerView.A1;
            if (i > 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            zq0Var.a(f);
            if (i > 0) {
                f2 = 1.0f;
            }
            zq0Var.b(f2);
            x13Var2 = x13.a(x13Var2, c);
        }
    }
}
