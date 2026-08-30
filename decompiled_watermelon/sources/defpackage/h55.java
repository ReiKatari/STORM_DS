package defpackage;

import java.net.Proxy;
import java.net.UnknownServiceException;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h55  reason: default package */
/* loaded from: classes.dex */
public final class h55 {
    public final fn6 a;
    public final bo1 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final da i;
    public final qb5 j;
    public final w45 k;
    public final boolean l;
    public sb m;
    public e55 n;
    public ir5 o;
    public final xt p;

    public h55(fn6 fn6Var, bo1 bo1Var, int i, int i2, int i3, int i4, boolean z, boolean z2, da daVar, qb5 qb5Var, w45 w45Var, ka kaVar) {
        fn6Var.getClass();
        bo1Var.getClass();
        qb5Var.getClass();
        this.a = fn6Var;
        this.b = bo1Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = daVar;
        this.j = qb5Var;
        this.k = w45Var;
        this.l = !b53.x((String) kaVar.L, "GET");
        this.p = new xt();
    }

    public final boolean a(x45 x45Var) {
        e55 e55Var;
        ir5 ir5Var;
        if (this.p.isEmpty() && this.o == null) {
            if (x45Var != null) {
                synchronized (x45Var) {
                    ir5Var = null;
                    if (x45Var.l == 0 && x45Var.j && ik7.a(x45Var.c.a.h, this.i.h)) {
                        ir5Var = x45Var.c;
                    }
                }
                if (ir5Var != null) {
                    this.o = ir5Var;
                    return true;
                }
            }
            sb sbVar = this.m;
            if ((sbVar == null || sbVar.B >= ((ArrayList) sbVar.L).size()) && (e55Var = this.n) != null) {
                return e55Var.h();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.or5 b() {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h55.b():or5");
    }

    public final mw0 c(ir5 ir5Var, ArrayList arrayList) {
        ir5Var.getClass();
        da daVar = ir5Var.a;
        if (daVar.c == null) {
            if (daVar.j.contains(ax0.f)) {
                String str = ir5Var.a.h.d;
                fo4 fo4Var = fo4.a;
                if (!fo4.a.h(str)) {
                    throw new UnknownServiceException(wh1.A("CLEARTEXT communication to ", str, " not permitted by network security policy"));
                }
            } else {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
        } else if (daVar.i.contains(dw4.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        ka kaVar = null;
        if (ir5Var.b.type() == Proxy.Type.HTTP) {
            da daVar2 = ir5Var.a;
            if (daVar2.c != null || daVar2.i.contains(dw4.H2_PRIOR_KNOWLEDGE)) {
                r9 r9Var = new r9(13);
                hu2 hu2Var = ir5Var.a.h;
                hu2Var.getClass();
                r9Var.a = hu2Var;
                r9Var.D("CONNECT", null);
                da daVar3 = ir5Var.a;
                r9Var.B("Host", ik7.h(daVar3.h, true));
                r9Var.B("Proxy-Connection", "Keep-Alive");
                r9Var.B("User-Agent", "okhttp/5.3.2");
                kaVar = new ka(r9Var);
                fc5 fc5Var = gc5.A;
                vq2 vq2Var = new vq2(0, (byte) 0);
                dw4.HTTP_1_1.getClass();
                ie7.b("Proxy-Authenticate");
                ie7.c("OkHttp-Preemptive", "Proxy-Authenticate");
                vq2Var.r("Proxy-Authenticate");
                ie7.a(vq2Var, "Proxy-Authenticate", "OkHttp-Preemptive");
                vq2Var.f();
                fc5Var.getClass();
                daVar3.f.getClass();
            }
        }
        return new mw0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.k, this, ir5Var, arrayList, kaVar, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r9 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.sf5 d(defpackage.mw0 r11, java.util.List r12) {
        /*
            r10 = this;
            bo1 r0 = r10.b
            boolean r1 = r10.l
            da r2 = r10.i
            w45 r3 = r10.k
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.e()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            r0.getClass()
            java.io.Serializable r0 = r0.d
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L23:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L6b
            java.lang.Object r7 = r0.next()
            x45 r7 = (defpackage.x45) r7
            r7.getClass()
            monitor-enter(r7)
            if (r6 == 0) goto L43
            pt2 r9 = r7.i     // Catch: java.lang.Throwable -> L41
            if (r9 == 0) goto L3c
            r9 = r5
            goto L3d
        L3c:
            r9 = r4
        L3d:
            if (r9 != 0) goto L43
        L3f:
            r9 = r4
            goto L4e
        L41:
            r10 = move-exception
            goto L69
        L43:
            boolean r9 = r7.e(r2, r12)     // Catch: java.lang.Throwable -> L41
            if (r9 != 0) goto L4a
            goto L3f
        L4a:
            r3.b(r7)     // Catch: java.lang.Throwable -> L41
            r9 = r5
        L4e:
            monitor-exit(r7)
            if (r9 == 0) goto L23
            boolean r9 = r7.g(r1)
            if (r9 == 0) goto L58
            goto L6c
        L58:
            monitor-enter(r7)
            r7.j = r5     // Catch: java.lang.Throwable -> L66
            java.net.Socket r8 = r3.l()     // Catch: java.lang.Throwable -> L66
            monitor-exit(r7)
            if (r8 == 0) goto L23
            defpackage.ik7.b(r8)
            goto L23
        L66:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        L69:
            monitor-exit(r7)
            throw r10
        L6b:
            r7 = r8
        L6c:
            if (r7 != 0) goto L6f
            return r8
        L6f:
            if (r11 == 0) goto L7c
            ir5 r12 = r11.j
            r10.o = r12
            java.net.Socket r10 = r11.q
            if (r10 == 0) goto L7c
            defpackage.ik7.b(r10)
        L7c:
            sf5 r10 = new sf5
            r10.<init>(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h55.d(mw0, java.util.List):sf5");
    }
}
