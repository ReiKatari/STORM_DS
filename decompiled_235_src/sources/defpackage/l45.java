package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l45  reason: default package */
/* loaded from: classes.dex */
public final class l45 {
    public final ArrayList a = new ArrayList();
    public final hx6 b;
    public e83 c;
    public e83 d;
    public int e;
    public boolean f;

    public l45(hx6 hx6Var, ArrayList arrayList) {
        e83 e83Var = e83.e;
        this.c = e83Var;
        this.d = e83Var;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = hx6Var.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            e83 e83Var2 = hx6Var.c;
            e83 e83Var3 = hx6Var.d;
            this.c = e83Var2;
            this.d = e83Var3;
            c();
            b(hx6Var.e);
        }
        this.b = hx6Var;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mt0 mt0Var = (mt0) list.get(i);
            mt0Var.getClass();
            if (true == z) {
                l45 l45Var = mt0Var.e;
                if (l45Var == null) {
                    mt0Var.e = this;
                    this.a.add(mt0Var);
                } else {
                    throw new IllegalStateException(mt0Var + " (" + (i + 1) + "/" + size + ") is already controlled by " + l45Var + " but is still added to " + this);
                }
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            mt0 mt0Var = (mt0) arrayList.get(size);
            if (!mt0Var.g) {
                ColorDrawable colorDrawable = mt0Var.f;
                if (mt0Var.h != i) {
                    mt0Var.h = i;
                    colorDrawable.setColor(i);
                    k45 k45Var = mt0Var.b;
                    k45Var.e = colorDrawable;
                    ap3 ap3Var = k45Var.i;
                    if (ap3Var != null) {
                        ((View) ap3Var.L).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i;
        e83 c;
        boolean z;
        float f;
        ArrayList arrayList = this.a;
        e83 e83Var = e83.e;
        e83 e83Var2 = e83Var;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            mt0 mt0Var = (mt0) arrayList.get(size);
            e83 e83Var3 = this.c;
            e83 e83Var4 = this.d;
            mt0Var.c = e83Var3;
            k45 k45Var = mt0Var.b;
            mt0Var.d = e83Var4;
            if (!k45Var.c.equals(e83Var2)) {
                k45Var.c = e83Var2;
                ap3 ap3Var = k45Var.i;
                if (ap3Var != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ap3Var.B;
                    layoutParams.leftMargin = e83Var2.a;
                    layoutParams.topMargin = e83Var2.b;
                    layoutParams.rightMargin = e83Var2.c;
                    layoutParams.bottomMargin = e83Var2.d;
                    ((View) ap3Var.L).setLayoutParams(layoutParams);
                }
            }
            int i2 = mt0Var.a;
            int i3 = 8;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 != 8) {
                            c = e83Var;
                            i = 0;
                        } else {
                            i = mt0Var.c.d;
                            int i4 = mt0Var.d.d;
                            if (k45Var.b != i4) {
                                k45Var.b = i4;
                                ap3 ap3Var2 = k45Var.i;
                                if (ap3Var2 != null) {
                                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ap3Var2.B;
                                    layoutParams2.height = i4;
                                    ((View) ap3Var2.L).setLayoutParams(layoutParams2);
                                }
                            }
                            c = e83.c(0, 0, 0, i);
                        }
                    } else {
                        i = mt0Var.c.c;
                        int i5 = mt0Var.d.c;
                        if (k45Var.a != i5) {
                            k45Var.a = i5;
                            ap3 ap3Var3 = k45Var.i;
                            if (ap3Var3 != null) {
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ap3Var3.B;
                                layoutParams3.width = i5;
                                ((View) ap3Var3.L).setLayoutParams(layoutParams3);
                            }
                        }
                        c = e83.c(0, 0, i, 0);
                    }
                } else {
                    i = mt0Var.c.b;
                    int i6 = mt0Var.d.b;
                    if (k45Var.b != i6) {
                        k45Var.b = i6;
                        ap3 ap3Var4 = k45Var.i;
                        if (ap3Var4 != null) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ap3Var4.B;
                            layoutParams4.height = i6;
                            ((View) ap3Var4.L).setLayoutParams(layoutParams4);
                        }
                    }
                    c = e83.c(0, i, 0, 0);
                }
            } else {
                i = mt0Var.c.a;
                int i7 = mt0Var.d.a;
                if (k45Var.a != i7) {
                    k45Var.a = i7;
                    ap3 ap3Var5 = k45Var.i;
                    if (ap3Var5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ap3Var5.B;
                        layoutParams5.width = i7;
                        ((View) ap3Var5.L).setLayoutParams(layoutParams5);
                    }
                }
                c = e83.c(i, 0, 0, 0);
            }
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (k45Var.d != z) {
                k45Var.d = z;
                ap3 ap3Var6 = k45Var.i;
                if (ap3Var6 != null) {
                    View view = (View) ap3Var6.L;
                    if (z) {
                        i3 = 0;
                    }
                    view.setVisibility(i3);
                }
            }
            float f2 = RecyclerView.B1;
            if (i > 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            mt0Var.a(f);
            if (i > 0) {
                f2 = 1.0f;
            }
            mt0Var.b(f2);
            e83Var2 = e83.a(e83Var2, c);
        }
    }
}
