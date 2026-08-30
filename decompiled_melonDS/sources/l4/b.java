package l4;

import ai.s0;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.text.TextUtils;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final t4.c f8780a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8781b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8782c;

    /* renamed from: d  reason: collision with root package name */
    public final m4.k f8783d;

    /* renamed from: e  reason: collision with root package name */
    public final CharSequence f8784e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f8785f;

    /* JADX WARN: Removed duplicated region for block: B:103:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(t4.c r22, int r23, int r24, long r25) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.b.<init>(t4.c, int, int, long):void");
    }

    public final m4.k a(int i2, int i10, TextUtils.TruncateAt truncateAt, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence) {
        boolean z10;
        y yVar;
        float d4 = d();
        t4.c cVar = this.f8780a;
        t4.e eVar = cVar.Z;
        int i16 = cVar.f13117f0;
        m4.f fVar = cVar.f13114c0;
        r0 r0Var = cVar.B;
        t4.a aVar = t4.b.f13112a;
        a0 a0Var = r0Var.f8889c;
        if (a0Var != null && (yVar = a0Var.f8779b) != null) {
            z10 = yVar.f8917a;
        } else {
            z10 = false;
        }
        return new m4.k(charSequence, d4, eVar, i2, truncateAt, i16, z10, i11, i13, i14, i15, i12, i10, fVar);
    }

    public final float b() {
        return this.f8783d.a();
    }

    /* JADX WARN: Type inference failed for: r13v26, types: [m4.a] */
    public final long c(h3.c cVar, int i2, fj.j jVar) {
        boolean z10;
        n4.d cVar2;
        int i10;
        int[] iArr;
        SegmentFinder m;
        RectF x9 = i3.z.x(cVar);
        if (i2 != 0 && i2 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        final ai.s0 s0Var = new ai.s0(9, jVar);
        m4.k kVar = this.f8783d;
        TextPaint textPaint = kVar.f9216a;
        Layout layout = kVar.f9221f;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (z10) {
                m = new n4.a(new jb.c(20, layout.getText(), kVar.j()));
            } else {
                d2.j.t();
                m = d2.j.m(d2.j.l(layout.getText(), textPaint));
            }
            iArr = layout.getRangeForRect(x9, m, new Layout.TextInclusionStrategy() { // from class: m4.a
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) s0.this.j(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            a7.v c4 = kVar.c();
            if (z10) {
                cVar2 = new jb.c(20, layout.getText(), kVar.j());
            } else {
                CharSequence text = layout.getText();
                if (i11 >= 29) {
                    cVar2 = new n4.b(text, textPaint);
                } else {
                    cVar2 = new n4.c(text);
                }
            }
            n4.d dVar = cVar2;
            int lineForVertical = layout.getLineForVertical((int) x9.top);
            if (x9.top <= kVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < kVar.f9222g) {
                int i12 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) x9.bottom);
                if (lineForVertical2 != 0 || x9.bottom >= kVar.g(0)) {
                    int f02 = ij.a.f0(kVar, layout, c4, i12, x9, dVar, s0Var, true);
                    while (true) {
                        i10 = i12;
                        if (f02 != -1 || i10 >= lineForVertical2) {
                            break;
                        }
                        i12 = i10 + 1;
                        f02 = ij.a.f0(kVar, layout, c4, i12, x9, dVar, s0Var, true);
                    }
                    if (f02 != -1) {
                        int i13 = lineForVertical2;
                        int f03 = ij.a.f0(kVar, layout, c4, i13, x9, dVar, s0Var, false);
                        while (f03 == -1 && i10 < i13) {
                            i13--;
                            f03 = ij.a.f0(kVar, layout, c4, i13, x9, dVar, s0Var, false);
                        }
                        if (f03 != -1) {
                            iArr = new int[]{dVar.c(f02 + 1), dVar.e(f03 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        if (iArr == null) {
            return q0.f8883b;
        }
        return i0.b(iArr[0], iArr[1]);
    }

    public final float d() {
        return x4.a.h(this.f8782c);
    }

    public final void e(i3.q qVar) {
        Canvas a10 = i3.c.a(qVar);
        m4.k kVar = this.f8783d;
        if (kVar.f9219d) {
            a10.save();
            a10.clipRect(0.0f, 0.0f, d(), b());
        }
        int i2 = kVar.f9223h;
        if (a10.getClipBounds(kVar.f9230p)) {
            if (i2 != 0) {
                a10.translate(0.0f, i2);
            }
            ThreadLocal threadLocal = m4.l.f9232a;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new Canvas();
                threadLocal.set(obj);
            }
            m4.j jVar = (m4.j) obj;
            jVar.f9215a = a10;
            try {
                kVar.f9221f.draw(jVar);
                if (i2 != 0) {
                    a10.translate(0.0f, (-1) * i2);
                }
            } finally {
                jVar.f9215a = null;
            }
        }
        if (kVar.f9219d) {
            a10.restore();
        }
    }

    public final void f(i3.q qVar, long j2, i3.m0 m0Var, w4.l lVar, k3.e eVar) {
        t4.e eVar2 = this.f8780a.Z;
        int i2 = eVar2.f13120c;
        eVar2.d(j2);
        eVar2.f(m0Var);
        eVar2.g(lVar);
        eVar2.e(eVar);
        eVar2.b(3);
        e(qVar);
        eVar2.b(i2);
    }

    public final void g(i3.q qVar, i3.o oVar, float f8, i3.m0 m0Var, w4.l lVar, k3.e eVar) {
        t4.e eVar2 = this.f8780a.Z;
        int i2 = eVar2.f13120c;
        float d4 = d();
        float b10 = b();
        eVar2.c(oVar, (Float.floatToRawIntBits(b10) & 4294967295L) | (Float.floatToRawIntBits(d4) << 32), f8);
        eVar2.f(m0Var);
        eVar2.g(lVar);
        eVar2.e(eVar);
        eVar2.b(3);
        e(qVar);
        eVar2.b(i2);
    }
}
