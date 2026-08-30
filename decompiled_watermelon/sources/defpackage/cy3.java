package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cy3  reason: default package */
/* loaded from: classes.dex */
public final class cy3 extends f47 {
    public final je0 q;
    public final wg1 r;
    public final Size s;
    public final Object t;
    public y06 u;
    public kx2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
        r11 = r10[0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cy3(defpackage.je0 r10, defpackage.by3 r11, defpackage.wg1 r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy3.<init>(je0, by3, wg1):void");
    }

    @Override // defpackage.f47
    public final void A() {
        y06 y06Var = this.u;
        if (y06Var != null) {
            y06Var.b();
        }
        this.u = null;
        synchronized (this.t) {
            try {
                kx2 kx2Var = this.v;
                if (kx2Var != null) {
                    kx2Var.a();
                }
                this.v = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final kx2 G(Size size) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        kx2 kx2Var = this.v;
        if (kx2Var != null) {
            kx2Var.a();
        }
        kx2 kx2Var2 = new kx2(surface, size, this.h.x());
        this.v = kx2Var2;
        jv3.N(kx2Var2.e).a(new we(29, surface, surfaceTexture), iq2.l());
        return kx2Var2;
    }

    public final x06 H(Size size) {
        kx2 G;
        synchronized (this.t) {
            G = G(size);
        }
        y06 y06Var = this.u;
        if (y06Var != null) {
            y06Var.b();
        }
        y06 y06Var2 = new y06(new jv2(this, size, 1));
        this.u = y06Var2;
        x06 d = x06.d(new by3(), size);
        d.b.c = 1;
        d.b(G, sm1.d, -1);
        d.f = y06Var2;
        return d;
    }

    @Override // defpackage.f47
    public final b57 g(boolean z, e57 e57Var) {
        e57Var.getClass();
        this.q.getClass();
        this.r.getClass();
        return new by3();
    }

    @Override // defpackage.f47
    public final a57 m(cw0 cw0Var) {
        cw0Var.getClass();
        this.q.getClass();
        this.r.getClass();
        return new so1(13);
    }

    @Override // defpackage.f47
    public final jx z(jx jxVar, jx jxVar2) {
        Size size = this.s;
        E(l07.b0(H(size).c()));
        cw6 b = jxVar.b();
        b.a = size;
        return b.a();
    }
}
