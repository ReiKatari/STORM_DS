package p4;

import l.i0;
import mh.z;
import p1.a0;
import zc.a1;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public final l7.a f11304a;

    /* renamed from: b  reason: collision with root package name */
    public final a f11305b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f11306c;

    /* renamed from: d  reason: collision with root package name */
    public final g f11307d;

    /* renamed from: e  reason: collision with root package name */
    public final i0 f11308e;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, p4.g] */
    public e(l7.a aVar, a aVar2) {
        a0 a0Var = f.f11309a;
        a0 a0Var2 = f.f11309a;
        ?? obj = new Object();
        b9.g gVar = g.f11310a;
        ad.e eVar = t4.h.f13127a;
        gVar.getClass();
        x.a(pc.a.G(gVar, eVar).H(cc.h.A).H(new a1(null)));
        i0 i0Var = new i0(18);
        this.f11304a = aVar;
        this.f11305b = aVar2;
        this.f11306c = a0Var;
        this.f11307d = obj;
        this.f11308e = i0Var;
        new z(15, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079 A[Catch: Exception -> 0x0081, TRY_ENTER, TryCatch #2 {Exception -> 0x0081, blocks: (B:15:0x0027, B:17:0x003a, B:20:0x003f, B:22:0x0043, B:25:0x0050, B:42:0x0079, B:43:0x0080, B:24:0x004c), top: B:53:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p4.r a(p4.q r7) {
        /*
            r6 = this;
            p1.a0 r0 = r6.f11306c
            java.lang.Object r1 = r0.B
            k0.g r1 = (k0.g) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.L     // Catch: java.lang.Throwable -> L24
            a1.s r2 = (a1.s) r2     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.h(r7)     // Catch: java.lang.Throwable -> L24
            p4.r r2 = (p4.r) r2     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L26
            boolean r3 = r2.B     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L19
            monitor-exit(r1)
            return r2
        L19:
            java.lang.Object r2 = r0.L     // Catch: java.lang.Throwable -> L24
            a1.s r2 = (a1.s) r2     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.m(r7)     // Catch: java.lang.Throwable -> L24
            p4.r r2 = (p4.r) r2     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r7 = move-exception
            goto L8a
        L26:
            monitor-exit(r1)
            p4.g r1 = r6.f11307d     // Catch: java.lang.Exception -> L81
            r1.getClass()     // Catch: java.lang.Exception -> L81
            p4.p r1 = r7.f11317a     // Catch: java.lang.Exception -> L81
            l.i0 r2 = r6.f11308e     // Catch: java.lang.Exception -> L81
            java.lang.Object r2 = r2.B     // Catch: java.lang.Exception -> L81
            p4.o r2 = (p4.o) r2     // Catch: java.lang.Exception -> L81
            int r3 = r7.f11319c     // Catch: java.lang.Exception -> L81
            p4.j r4 = r7.f11318b     // Catch: java.lang.Exception -> L81
            if (r1 == 0) goto L4c
            boolean r5 = r1 instanceof p4.b     // Catch: java.lang.Exception -> L81
            if (r5 == 0) goto L3f
            goto L4c
        L3f:
            boolean r5 = r1 instanceof p4.l     // Catch: java.lang.Exception -> L81
            if (r5 == 0) goto L4a
            p4.l r1 = (p4.l) r1     // Catch: java.lang.Exception -> L81
            android.graphics.Typeface r1 = r2.b(r1, r4, r3)     // Catch: java.lang.Exception -> L81
            goto L50
        L4a:
            r1 = 0
            goto L56
        L4c:
            android.graphics.Typeface r1 = r2.d(r4, r3)     // Catch: java.lang.Exception -> L81
        L50:
            p4.r r2 = new p4.r     // Catch: java.lang.Exception -> L81
            r2.<init>(r1)     // Catch: java.lang.Exception -> L81
            r1 = r2
        L56:
            if (r1 == 0) goto L79
            java.lang.Object r2 = r0.B
            k0.g r2 = (k0.g) r2
            monitor-enter(r2)
            java.lang.Object r3 = r0.L     // Catch: java.lang.Throwable -> L73
            a1.s r3 = (a1.s) r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r3 = r3.h(r7)     // Catch: java.lang.Throwable -> L73
            if (r3 != 0) goto L75
            boolean r3 = r1.B     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L75
            java.lang.Object r0 = r0.L     // Catch: java.lang.Throwable -> L73
            a1.s r0 = (a1.s) r0     // Catch: java.lang.Throwable -> L73
            r0.l(r7, r1)     // Catch: java.lang.Throwable -> L73
            goto L75
        L73:
            r7 = move-exception
            goto L77
        L75:
            monitor-exit(r2)
            return r1
        L77:
            monitor-exit(r2)
            throw r7
        L79:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L81
            java.lang.String r0 = "Could not load font"
            r7.<init>(r0)     // Catch: java.lang.Exception -> L81
            throw r7     // Catch: java.lang.Exception -> L81
        L81:
            r7 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not load font"
            r0.<init>(r1, r7)
            throw r0
        L8a:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.e.a(p4.q):p4.r");
    }

    public final r b(p pVar, j jVar, int i2, int i10) {
        j jVar2;
        a aVar = this.f11305b;
        aVar.getClass();
        int i11 = aVar.A;
        if (i11 != 0 && i11 != Integer.MAX_VALUE) {
            jVar2 = new j(p7.j.g(jVar.A + i11, 1, 1000));
        } else {
            jVar2 = jVar;
        }
        this.f11304a.getClass();
        return a(new q(pVar, jVar2, i2, i10, null));
    }
}
