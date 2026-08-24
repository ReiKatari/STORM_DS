package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: as1  reason: default package */
/* loaded from: classes.dex */
public final class as1 extends zr1 {
    @Override // defpackage.xr1, defpackage.vr1, defpackage.bs1
    public void b(ix6 ix6Var, ix6 ix6Var2, Window window, View view, boolean z, boolean z2) {
        ViewGroup viewGroup;
        boolean z3;
        bv7 wu7Var;
        int i;
        mt0 mt0Var;
        ix6Var.getClass();
        ix6Var2.getClass();
        window.getClass();
        view.getClass();
        int i2 = 0;
        kt7.a(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int a = ix6Var.a(z);
        int a2 = ix6Var2.a(z2);
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
                            if (list.size() == 4 && (list.get(i2) instanceof mt0)) {
                                for (Object obj : (Iterable) tag) {
                                    if (obj instanceof mt0) {
                                        mt0Var = (mt0) obj;
                                    } else {
                                        mt0Var = null;
                                    }
                                    if (mt0Var != null) {
                                        mt0 mt0Var2 = (mt0) obj;
                                        int i5 = mt0Var2.a;
                                        k45 k45Var = mt0Var2.b;
                                        ColorDrawable colorDrawable = mt0Var2.f;
                                        if (i5 != 1) {
                                            if (i5 != 2) {
                                                if (i5 != 4) {
                                                    if (i5 == 8) {
                                                        mt0Var2.g = true;
                                                        if (mt0Var2.h != a2) {
                                                            mt0Var2.h = a2;
                                                            colorDrawable.setColor(a2);
                                                            k45Var.e = colorDrawable;
                                                            ap3 ap3Var = k45Var.i;
                                                            if (ap3Var != null) {
                                                                ((View) ap3Var.L).setBackground(colorDrawable);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    mt0Var2.g = true;
                                                    if (mt0Var2.h != a2) {
                                                        mt0Var2.h = a2;
                                                        colorDrawable.setColor(a2);
                                                        k45Var.e = colorDrawable;
                                                        ap3 ap3Var2 = k45Var.i;
                                                        if (ap3Var2 != null) {
                                                            ((View) ap3Var2.L).setBackground(colorDrawable);
                                                        }
                                                    }
                                                }
                                            } else {
                                                mt0Var2.g = true;
                                                if (mt0Var2.h != a) {
                                                    mt0Var2.h = a;
                                                    colorDrawable.setColor(a);
                                                    k45Var.e = colorDrawable;
                                                    ap3 ap3Var3 = k45Var.i;
                                                    if (ap3Var3 != null) {
                                                        ((View) ap3Var3.L).setBackground(colorDrawable);
                                                    }
                                                }
                                            }
                                        } else {
                                            mt0Var2.g = true;
                                            if (mt0Var2.h != a2) {
                                                mt0Var2.h = a2;
                                                colorDrawable.setColor(a2);
                                                k45Var.e = colorDrawable;
                                                ap3 ap3Var4 = k45Var.i;
                                                if (ap3Var4 != null) {
                                                    ((View) ap3Var4.L).setBackground(colorDrawable);
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
                    List c0 = hf.c0(new mt0(2, a), new mt0(1, a2), new mt0(4, a2), new mt0(8, a2));
                    m45 m45Var = new m45(((ViewGroup) view).getContext(), c0);
                    m45Var.setTag(c0);
                    viewGroup.addView(m45Var);
                }
            }
        }
        if (ix6Var2.c == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        window.setNavigationBarContrastEnforced(z3);
        s35 s35Var = new s35(view);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 35) {
            wu7Var = new zu7(window, s35Var);
        } else if (i6 >= 30) {
            wu7Var = new zu7(window, s35Var);
        } else if (i6 >= 26) {
            wu7Var = new wu7(window, s35Var);
        } else {
            wu7Var = new wu7(window, s35Var);
        }
        wu7Var.d(!z);
        wu7Var.c(!z2);
    }
}
