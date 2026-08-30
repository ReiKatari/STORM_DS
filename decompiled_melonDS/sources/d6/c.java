package d6;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3907a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final g f3908b;

    /* renamed from: c  reason: collision with root package name */
    public q5.b f3909c;

    /* renamed from: d  reason: collision with root package name */
    public q5.b f3910d;

    /* renamed from: e  reason: collision with root package name */
    public int f3911e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3912f;

    public c(g gVar, ArrayList arrayList) {
        q5.b bVar = q5.b.f12282e;
        this.f3909c = bVar;
        this.f3910d = bVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = gVar.f3914b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            q5.b bVar2 = gVar.f3915c;
            q5.b bVar3 = gVar.f3916d;
            this.f3909c = bVar2;
            this.f3910d = bVar3;
            c();
            b(gVar.f3917e);
        }
        this.f3908b = gVar;
    }

    public final void a(List list, boolean z10) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = (a) list.get(i2);
            aVar.getClass();
            if (true == z10) {
                c cVar = aVar.f3894e;
                if (cVar == null) {
                    aVar.f3894e = this;
                    this.f3907a.add(aVar);
                } else {
                    throw new IllegalStateException(aVar + " is already controlled by " + cVar);
                }
            }
        }
    }

    public final void b(int i2) {
        ArrayList arrayList = this.f3907a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (!aVar.f3896g) {
                ColorDrawable colorDrawable = aVar.f3895f;
                if (aVar.f3897h != i2) {
                    aVar.f3897h = i2;
                    colorDrawable.setColor(i2);
                    b bVar = aVar.f3891b;
                    bVar.f3902e = colorDrawable;
                    a0.g gVar = bVar.f3906i;
                    if (gVar != null) {
                        ((View) gVar.L).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i2;
        q5.b c4;
        boolean z10;
        float f8;
        ArrayList arrayList = this.f3907a;
        q5.b bVar = q5.b.f12282e;
        q5.b bVar2 = bVar;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            q5.b bVar3 = this.f3909c;
            q5.b bVar4 = this.f3910d;
            aVar.f3892c = bVar3;
            b bVar5 = aVar.f3891b;
            aVar.f3893d = bVar4;
            if (!bVar5.f3900c.equals(bVar2)) {
                bVar5.f3900c = bVar2;
                a0.g gVar = bVar5.f3906i;
                if (gVar != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gVar.B;
                    layoutParams.leftMargin = bVar2.f12283a;
                    layoutParams.topMargin = bVar2.f12284b;
                    layoutParams.rightMargin = bVar2.f12285c;
                    layoutParams.bottomMargin = bVar2.f12286d;
                    ((View) gVar.L).setLayoutParams(layoutParams);
                }
            }
            int i10 = aVar.f3890a;
            int i11 = 4;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 8) {
                            c4 = bVar;
                            i2 = 0;
                        } else {
                            i2 = aVar.f3892c.f12286d;
                            int i12 = aVar.f3893d.f12286d;
                            if (bVar5.f3899b != i12) {
                                bVar5.f3899b = i12;
                                a0.g gVar2 = bVar5.f3906i;
                                if (gVar2 != null) {
                                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) gVar2.B;
                                    layoutParams2.height = i12;
                                    ((View) gVar2.L).setLayoutParams(layoutParams2);
                                }
                            }
                            c4 = q5.b.c(0, 0, 0, i2);
                        }
                    } else {
                        i2 = aVar.f3892c.f12285c;
                        int i13 = aVar.f3893d.f12285c;
                        if (bVar5.f3898a != i13) {
                            bVar5.f3898a = i13;
                            a0.g gVar3 = bVar5.f3906i;
                            if (gVar3 != null) {
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) gVar3.B;
                                layoutParams3.width = i13;
                                ((View) gVar3.L).setLayoutParams(layoutParams3);
                            }
                        }
                        c4 = q5.b.c(0, 0, i2, 0);
                    }
                } else {
                    i2 = aVar.f3892c.f12284b;
                    int i14 = aVar.f3893d.f12284b;
                    if (bVar5.f3899b != i14) {
                        bVar5.f3899b = i14;
                        a0.g gVar4 = bVar5.f3906i;
                        if (gVar4 != null) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) gVar4.B;
                            layoutParams4.height = i14;
                            ((View) gVar4.L).setLayoutParams(layoutParams4);
                        }
                    }
                    c4 = q5.b.c(0, i2, 0, 0);
                }
            } else {
                i2 = aVar.f3892c.f12283a;
                int i15 = aVar.f3893d.f12283a;
                if (bVar5.f3898a != i15) {
                    bVar5.f3898a = i15;
                    a0.g gVar5 = bVar5.f3906i;
                    if (gVar5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) gVar5.B;
                        layoutParams5.width = i15;
                        ((View) gVar5.L).setLayoutParams(layoutParams5);
                    }
                }
                c4 = q5.b.c(i2, 0, 0, 0);
            }
            if (i2 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bVar5.f3901d != z10) {
                bVar5.f3901d = z10;
                a0.g gVar6 = bVar5.f3906i;
                if (gVar6 != null) {
                    View view = (View) gVar6.L;
                    if (z10) {
                        i11 = 0;
                    }
                    view.setVisibility(i11);
                }
            }
            float f10 = 0.0f;
            if (i2 > 0) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            aVar.a(f8);
            if (i2 > 0) {
                f10 = 1.0f;
            }
            aVar.b(f10);
            bVar2 = q5.b.a(bVar2, c4);
        }
    }
}
