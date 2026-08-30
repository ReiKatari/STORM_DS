package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qn1  reason: default package */
/* loaded from: classes.dex */
public final class qn1 extends pn1 {
    @Override // defpackage.nn1, defpackage.ln1, defpackage.rn1
    public void b(ml6 ml6Var, ml6 ml6Var2, Window window, View view, boolean z, boolean z2) {
        ViewGroup viewGroup;
        boolean z3;
        bg7 wf7Var;
        int i;
        zq0 zq0Var;
        ml6Var.getClass();
        ml6Var2.getClass();
        window.getClass();
        view.getClass();
        int i2 = 0;
        ie7.d(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int a = ml6Var.a(z);
        int a2 = ml6Var2.a(z2);
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            int i3 = 0;
            while (true) {
                if (i3 < viewGroup.getChildCount()) {
                    i = 1;
                } else {
                    i = i2;
                }
                if (i != 0) {
                    int i4 = i3 + 1;
                    View childAt = viewGroup.getChildAt(i3);
                    if (childAt != null) {
                        Object tag = childAt.getTag();
                        if (tag instanceof List) {
                            List list = (List) tag;
                            if (list.size() == 4 && (list.get(i2) instanceof zq0)) {
                                for (Object obj : (Iterable) tag) {
                                    if (obj instanceof zq0) {
                                        zq0Var = (zq0) obj;
                                    } else {
                                        zq0Var = null;
                                    }
                                    if (zq0Var != null) {
                                        zq0 zq0Var2 = (zq0) obj;
                                        int i5 = zq0Var2.a;
                                        dv4 dv4Var = zq0Var2.b;
                                        ColorDrawable colorDrawable = zq0Var2.f;
                                        if (i5 != 1) {
                                            if (i5 != 2) {
                                                if (i5 != 4) {
                                                    if (i5 == 8) {
                                                        zq0Var2.g = true;
                                                        if (zq0Var2.h != a2) {
                                                            zq0Var2.h = a2;
                                                            colorDrawable.setColor(a2);
                                                            dv4Var.e = colorDrawable;
                                                            ci3 ci3Var = dv4Var.i;
                                                            if (ci3Var != null) {
                                                                ((View) ci3Var.L).setBackground(colorDrawable);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    zq0Var2.g = true;
                                                    if (zq0Var2.h != a2) {
                                                        zq0Var2.h = a2;
                                                        colorDrawable.setColor(a2);
                                                        dv4Var.e = colorDrawable;
                                                        ci3 ci3Var2 = dv4Var.i;
                                                        if (ci3Var2 != null) {
                                                            ((View) ci3Var2.L).setBackground(colorDrawable);
                                                        }
                                                    }
                                                }
                                            } else {
                                                zq0Var2.g = true;
                                                if (zq0Var2.h != a) {
                                                    zq0Var2.h = a;
                                                    colorDrawable.setColor(a);
                                                    dv4Var.e = colorDrawable;
                                                    ci3 ci3Var3 = dv4Var.i;
                                                    if (ci3Var3 != null) {
                                                        ((View) ci3Var3.L).setBackground(colorDrawable);
                                                    }
                                                }
                                            }
                                        } else {
                                            zq0Var2.g = true;
                                            if (zq0Var2.h != a2) {
                                                zq0Var2.h = a2;
                                                colorDrawable.setColor(a2);
                                                dv4Var.e = colorDrawable;
                                                ci3 ci3Var4 = dv4Var.i;
                                                if (ci3Var4 != null) {
                                                    ((View) ci3Var4.L).setBackground(colorDrawable);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i3 = i4;
                        i2 = 0;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else if (a != 0 || a2 != 0) {
                    List c0 = l07.c0(new zq0(2, a), new zq0(1, a2), new zq0(4, a2), new zq0(8, a2));
                    fv4 fv4Var = new fv4(((ViewGroup) view).getContext(), c0);
                    fv4Var.setTag(c0);
                    viewGroup.addView(fv4Var);
                }
            }
        }
        if (ml6Var2.c == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        window.setNavigationBarContrastEnforced(z3);
        dz4 dz4Var = new dz4(view);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 35) {
            wf7Var = new zf7(window, dz4Var);
        } else if (i6 >= 30) {
            wf7Var = new zf7(window, dz4Var);
        } else if (i6 >= 26) {
            wf7Var = new wf7(window, dz4Var);
        } else {
            wf7Var = new wf7(window, dz4Var);
        }
        wf7Var.e(!z);
        wf7Var.d(!z2);
    }
}
