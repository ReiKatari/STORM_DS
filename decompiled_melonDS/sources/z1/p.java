package z1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import b4.r0;
import l1.r1;
import mh.z;
import n2.p1;
import n2.r;
import n2.s;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f14881a = new Object();

    public final void a(Drawable drawable, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        r rVar = (r) mVar;
        rVar.Z(257732500);
        if (rVar.h(drawable)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            b3.p i12 = r1.i(b3.m.f1770a, g1.f.f5029j);
            boolean h2 = rVar.h(drawable);
            Object L = rVar.L();
            if (h2 || L == n2.l.f9953a) {
                L = new z(28, drawable);
                rVar.h0(L);
            }
            l1.p.a(f3.g.d(i12, (mc.l) L), rVar, 0);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new qh.c(this, drawable, i2, 6);
        }
    }

    public final void b(final Icon icon, n2.m mVar, final int i2) {
        int i10;
        boolean z10;
        p1 r5;
        mc.p pVar;
        r rVar = (r) mVar;
        rVar.Z(2116504409);
        if (rVar.h(icon)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            Context context = (Context) rVar.j(r0.f1937b);
            boolean f8 = rVar.f(icon) | rVar.f(context);
            Object L = rVar.L();
            if (f8 || L == n2.l.f9953a) {
                L = icon.loadDrawable(context);
                rVar.h0(L);
            }
            Drawable drawable = (Drawable) L;
            if (drawable == null) {
                r5 = rVar.r();
                if (r5 != null) {
                    pVar = new mc.p(this, icon, i2, 0) { // from class: z1.o
                        public final /* synthetic */ int A;
                        public final /* synthetic */ p B;
                        public final /* synthetic */ Icon L;

                        {
                            this.A = r4;
                            this.B = this;
                        }

                        @Override // mc.p
                        public final Object j(Object obj, Object obj2) {
                            int i12 = this.A;
                            n2.m mVar2 = (n2.m) obj;
                            ((Integer) obj2).getClass();
                            switch (i12) {
                                case 0:
                                    this.B.b(this.L, mVar2, s.F(49));
                                    break;
                                default:
                                    this.B.b(this.L, mVar2, s.F(49));
                                    break;
                            }
                            return y.f14813a;
                        }
                    };
                    r5.f9983d = pVar;
                }
                return;
            }
            a(drawable, rVar, 48);
        } else {
            rVar.R();
        }
        r5 = rVar.r();
        if (r5 != null) {
            pVar = new mc.p(this, icon, i2, 1) { // from class: z1.o
                public final /* synthetic */ int A;
                public final /* synthetic */ p B;
                public final /* synthetic */ Icon L;

                {
                    this.A = r4;
                    this.B = this;
                }

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    int i12 = this.A;
                    n2.m mVar2 = (n2.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i12) {
                        case 0:
                            this.B.b(this.L, mVar2, s.F(49));
                            break;
                        default:
                            this.B.b(this.L, mVar2, s.F(49));
                            break;
                    }
                    return y.f14813a;
                }
            };
            r5.f9983d = pVar;
        }
    }
}
