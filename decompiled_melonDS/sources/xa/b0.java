package xa;

import android.net.Uri;
import java.lang.reflect.Type;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final ji.h f14457a;

    /* renamed from: b  reason: collision with root package name */
    public final ji.h f14458b;

    /* renamed from: c  reason: collision with root package name */
    public final ua.h f14459c;

    /* renamed from: d  reason: collision with root package name */
    public final bb.a f14460d;

    /* renamed from: e  reason: collision with root package name */
    public final ua.v f14461e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14462f;

    /* renamed from: g  reason: collision with root package name */
    public volatile ua.u f14463g;

    public b0(ji.h hVar, ji.h hVar2, ua.h hVar3, bb.a aVar, ua.v vVar, boolean z10) {
        this.f14457a = hVar;
        this.f14458b = hVar2;
        this.f14459c = hVar3;
        this.f14460d = aVar;
        this.f14461e = vVar;
        this.f14462f = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    @Override // ua.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(cb.a r4) {
        /*
            r3 = this;
            ji.h r0 = r3.f14458b
            if (r0 != 0) goto L19
            ua.u r0 = r3.f14463g
            if (r0 != 0) goto L14
            ua.h r0 = r3.f14459c
            ua.v r1 = r3.f14461e
            bb.a r2 = r3.f14460d
            ua.u r0 = r0.d(r1, r2)
            r3.f14463g = r0
        L14:
            java.lang.Object r4 = r0.b(r4)
            return r4
        L19:
            r4.d0()     // Catch: java.lang.NumberFormatException -> L26 java.io.IOException -> L28 cb.d -> L2a java.io.EOFException -> L40
            r0 = 0
            xa.n r1 = xa.g1.f14492z     // Catch: java.lang.NumberFormatException -> L26 java.io.IOException -> L28 cb.d -> L2a java.io.EOFException -> L2c
            java.lang.Object r4 = r1.b(r4)     // Catch: java.lang.NumberFormatException -> L26 java.io.IOException -> L28 cb.d -> L2a java.io.EOFException -> L2c
            ua.j r4 = (ua.j) r4     // Catch: java.lang.NumberFormatException -> L26 java.io.IOException -> L28 cb.d -> L2a java.io.EOFException -> L2c
            goto L46
        L26:
            r4 = move-exception
            goto L2e
        L28:
            r4 = move-exception
            goto L34
        L2a:
            r4 = move-exception
            goto L3a
        L2c:
            r4 = move-exception
            goto L42
        L2e:
            ua.k r0 = new ua.k
            r0.<init>(r4)
            throw r0
        L34:
            ua.k r0 = new ua.k
            r0.<init>(r4)
            throw r0
        L3a:
            ua.k r0 = new ua.k
            r0.<init>(r4)
            throw r0
        L40:
            r4 = move-exception
            r0 = 1
        L42:
            if (r0 == 0) goto L66
            ua.l r4 = ua.l.A
        L46:
            boolean r0 = r3.f14462f
            if (r0 == 0) goto L53
            r4.getClass()
            boolean r0 = r4 instanceof ua.l
            if (r0 == 0) goto L53
            r4 = 0
            return r4
        L53:
            bb.a r0 = r3.f14460d
            java.lang.reflect.Type r0 = r0.f2156b
            r4.getClass()
            java.lang.String r4 = r4.a()
            r4.getClass()
            android.net.Uri r4 = android.net.Uri.parse(r4)
            return r4
        L66:
            ua.k r0 = new ua.k
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.b0.b(cb.a):java.lang.Object");
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        if (this.f14457a == null) {
            ua.u uVar = this.f14463g;
            if (uVar == null) {
                uVar = this.f14459c.d(this.f14461e, this.f14460d);
                this.f14463g = uVar;
            }
            uVar.c(cVar, obj);
        } else if (this.f14462f && obj == null) {
            cVar.F();
        } else {
            Type type = this.f14460d.f2156b;
            ua.n nVar = new ua.n(String.valueOf((Uri) obj));
            g1.f14492z.getClass();
            n.f(cVar, nVar);
        }
    }

    @Override // xa.a0
    public final ua.u d() {
        if (this.f14457a != null) {
            return this;
        }
        ua.u uVar = this.f14463g;
        if (uVar == null) {
            ua.u d4 = this.f14459c.d(this.f14461e, this.f14460d);
            this.f14463g = d4;
            return d4;
        }
        return uVar;
    }
}
