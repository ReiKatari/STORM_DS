package e5;

import f5.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public int f4279b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4280c;

    /* renamed from: d  reason: collision with root package name */
    public final g f4281d;

    /* renamed from: e  reason: collision with root package name */
    public final c f4282e;

    /* renamed from: f  reason: collision with root package name */
    public d f4283f;

    /* renamed from: i  reason: collision with root package name */
    public c5.g f4286i;

    /* renamed from: a  reason: collision with root package name */
    public HashSet f4278a = null;

    /* renamed from: g  reason: collision with root package name */
    public int f4284g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f4285h = Integer.MIN_VALUE;

    public d(g gVar, c cVar) {
        this.f4281d = gVar;
        this.f4282e = cVar;
    }

    public final void a(d dVar, int i2) {
        b(dVar, i2, Integer.MIN_VALUE, false);
    }

    public final boolean b(d dVar, int i2, int i10, boolean z10) {
        if (dVar == null) {
            j();
            return true;
        } else if (!z10 && !i(dVar)) {
            return false;
        } else {
            this.f4283f = dVar;
            if (dVar.f4278a == null) {
                dVar.f4278a = new HashSet();
            }
            HashSet hashSet = this.f4283f.f4278a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f4284g = i2;
            this.f4285h = i10;
            return true;
        }
    }

    public final void c(int i2, q qVar, ArrayList arrayList) {
        HashSet hashSet = this.f4278a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                f5.i.b(((d) it.next()).f4281d, i2, arrayList, qVar);
            }
        }
    }

    public final int d() {
        if (!this.f4280c) {
            return 0;
        }
        return this.f4279b;
    }

    public final int e() {
        d dVar;
        if (this.f4281d.f4303h0 == 8) {
            return 0;
        }
        int i2 = this.f4285h;
        if (i2 != Integer.MIN_VALUE && (dVar = this.f4283f) != null && dVar.f4281d.f4303h0 == 8) {
            return i2;
        }
        return this.f4284g;
    }

    public final d f() {
        c cVar = this.f4282e;
        int ordinal = cVar.ordinal();
        g gVar = this.f4281d;
        switch (ordinal) {
            case 0:
            case l1.c.f8511g /* 5 */:
            case l1.c.f8509e /* 6 */:
            case 7:
            case 8:
                return null;
            case DSiCameraSource.FrontCamera /* 1 */:
                return gVar.K;
            case 2:
                return gVar.L;
            case 3:
                return gVar.I;
            case 4:
                return gVar.J;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f4278a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (this.f4283f != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0072 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(e5.d r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L5
            goto L74
        L5:
            e5.g r1 = r6.f4281d
            e5.c r6 = r6.f4282e
            e5.c r2 = r5.f4282e
            r3 = 1
            if (r6 != r2) goto L1d
            e5.c r6 = e5.c.BASELINE
            if (r2 != r6) goto L72
            boolean r6 = r1.E
            if (r6 == 0) goto L74
            e5.g r6 = r5.f4281d
            boolean r6 = r6.E
            if (r6 != 0) goto L72
            goto L74
        L1d:
            int r4 = r2.ordinal()
            switch(r4) {
                case 0: goto L74;
                case 1: goto L5c;
                case 2: goto L44;
                case 3: goto L5c;
                case 4: goto L44;
                case 5: goto L3b;
                case 6: goto L2e;
                case 7: goto L74;
                case 8: goto L74;
                default: goto L24;
            }
        L24:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r0 = r2.name()
            r6.<init>(r0)
            throw r6
        L2e:
            e5.c r1 = e5.c.BASELINE
            if (r6 == r1) goto L74
            e5.c r1 = e5.c.CENTER_X
            if (r6 == r1) goto L74
            e5.c r1 = e5.c.CENTER_Y
            if (r6 == r1) goto L74
            goto L72
        L3b:
            e5.c r1 = e5.c.LEFT
            if (r6 == r1) goto L74
            e5.c r1 = e5.c.RIGHT
            if (r6 != r1) goto L72
            goto L74
        L44:
            e5.c r2 = e5.c.TOP
            if (r6 == r2) goto L4f
            e5.c r2 = e5.c.BOTTOM
            if (r6 != r2) goto L4d
            goto L4f
        L4d:
            r2 = r0
            goto L50
        L4f:
            r2 = r3
        L50:
            boolean r1 = r1 instanceof e5.l
            if (r1 == 0) goto L5b
            if (r2 != 0) goto L72
            e5.c r1 = e5.c.CENTER_Y
            if (r6 != r1) goto L74
            goto L72
        L5b:
            return r2
        L5c:
            e5.c r2 = e5.c.LEFT
            if (r6 == r2) goto L67
            e5.c r2 = e5.c.RIGHT
            if (r6 != r2) goto L65
            goto L67
        L65:
            r2 = r0
            goto L68
        L67:
            r2 = r3
        L68:
            boolean r1 = r1 instanceof e5.l
            if (r1 == 0) goto L73
            if (r2 != 0) goto L72
            e5.c r1 = e5.c.CENTER_X
            if (r6 != r1) goto L74
        L72:
            return r3
        L73:
            return r2
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.d.i(e5.d):boolean");
    }

    public final void j() {
        HashSet hashSet;
        d dVar = this.f4283f;
        if (dVar != null && (hashSet = dVar.f4278a) != null) {
            hashSet.remove(this);
            if (this.f4283f.f4278a.size() == 0) {
                this.f4283f.f4278a = null;
            }
        }
        this.f4278a = null;
        this.f4283f = null;
        this.f4284g = 0;
        this.f4285h = Integer.MIN_VALUE;
        this.f4280c = false;
        this.f4279b = 0;
    }

    public final void k() {
        c5.g gVar = this.f4286i;
        if (gVar == null) {
            this.f4286i = new c5.g(c5.f.UNRESTRICTED);
        } else {
            gVar.c();
        }
    }

    public final void l(int i2) {
        this.f4279b = i2;
        this.f4280c = true;
    }

    public final String toString() {
        return this.f4281d.f4307j0 + ":" + this.f4282e.toString();
    }
}
