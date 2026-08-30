package kf;

import android.content.Context;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 implements cf.c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8244a;

    /* renamed from: b  reason: collision with root package name */
    public final ua.h f8245b;

    /* renamed from: c  reason: collision with root package name */
    public final cf.d f8246c;

    /* renamed from: d  reason: collision with root package name */
    public final xf.a f8247d;

    /* renamed from: e  reason: collision with root package name */
    public final ah.h0 f8248e;

    /* renamed from: f  reason: collision with root package name */
    public final Type f8249f;

    /* renamed from: g  reason: collision with root package name */
    public final cd.e1 f8250g;

    /* renamed from: h  reason: collision with root package name */
    public final cd.q1 f8251h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f8252i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicBoolean f8253j;

    public l0(Context context, ua.h hVar, cf.d dVar, xf.a aVar) {
        this.f8244a = context;
        this.f8245b = hVar;
        this.f8246c = dVar;
        this.f8247d = aVar;
        gd.f fVar = zc.g0.f15015a;
        ah.h0 a10 = zc.x.a(gd.e.L);
        this.f8248e = a10;
        Type type = new bb.a().f2156b;
        type.getClass();
        this.f8249f = type;
        this.f8250g = cd.q.b(1, 0, bd.a.DROP_OLDEST, 2);
        this.f8251h = cd.q.c(oe.g0.NOT_SCANNING);
        this.f8252i = new ArrayList();
        this.f8253j = new AtomicBoolean(false);
        zc.x.v(a10, null, null, new e0(this, null, 0), 3);
        zc.x.v(a10, null, null, new e0(this, null, 1), 3);
    }

    public static final void a(l0 l0Var, ze.a aVar) {
        Object obj;
        ArrayList arrayList = l0Var.f8252i;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = arrayList.get(i2);
                i2++;
                ze.a aVar2 = (ze.a) obj;
                aVar2.getClass();
                aVar.getClass();
                if (nc.k.a(aVar2.f15056d, aVar.f15056d)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ze.a aVar3 = (ze.a) obj;
        if (nc.k.a(aVar3, aVar)) {
            return;
        }
        if (aVar3 != null) {
            ze.a a10 = ze.a.a(aVar3, aVar.f15053a, aVar.f15054b, null, aVar.f15060h, aVar.f15061i, 0L, 636);
            arrayList.remove(aVar3);
            arrayList.add(a10);
        } else {
            arrayList.add(aVar);
        }
        l0Var.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011f A[EDGE_INSN: B:72:0x011f->B:58:0x011f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v3, types: [yb.k] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(kf.l0 r22, ec.c r23) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.l0.b(kf.l0, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (c(r6, r13, r0) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        r6 = r12;
        r12 = r5;
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
        if (r13.a(r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006a -> B:24:0x006d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0077 -> B:32:0x009d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0088 -> B:32:0x009d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(k6.a r11, cd.i r12, ec.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof kf.f0
            if (r0 == 0) goto L13
            r0 = r13
            kf.f0 r0 = (kf.f0) r0
            int r1 = r0.f8216e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8216e0 = r1
            goto L18
        L13:
            kf.f0 r0 = new kf.f0
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f8214c0
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f8216e0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L2e
            if (r2 != r3) goto L27
            goto L2e
        L27:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r11)
            r11 = 0
            return r11
        L2e:
            int r11 = r0.f8213b0
            int r12 = r0.Z
            k6.a[] r2 = r0.Y
            cd.i r5 = r0.X
            k6.a r6 = r0.R
            p7.j.I(r13)
            goto L6d
        L3c:
            p7.j.I(r13)
            k6.a[] r13 = r11.k()
            r13.getClass()
            int r2 = r13.length
            r5 = 0
            r9 = r12
            r12 = r11
            r11 = r2
            r2 = r13
            r13 = r9
        L4d:
            if (r5 >= r11) goto L9f
            r6 = r2[r5]
            boolean r7 = r6.h()
            if (r7 == 0) goto L71
            r0.R = r12
            r0.X = r13
            r0.Y = r2
            r0.Z = r5
            r0.f8213b0 = r11
            r0.f8216e0 = r4
            java.lang.Object r6 = r10.c(r6, r13, r0)
            if (r6 != r1) goto L6a
            goto L9c
        L6a:
            r6 = r12
            r12 = r5
            r5 = r13
        L6d:
            r13 = r5
            r5 = r12
            r12 = r6
            goto L9d
        L71:
            xf.a r7 = r10.f8247d
            zd.f r7 = r7.a(r6)
            if (r7 == 0) goto L9d
            android.net.Uri r6 = r6.g()
            r6.getClass()
            android.net.Uri r8 = r12.g()
            ze.a r6 = r7.d(r6, r8)
            if (r6 == 0) goto L9d
            r0.R = r12
            r0.X = r13
            r0.Y = r2
            r0.Z = r5
            r0.f8213b0 = r11
            r0.f8216e0 = r3
            java.lang.Object r6 = r13.a(r6, r0)
            if (r6 != r1) goto L6a
        L9c:
            return r1
        L9d:
            int r5 = r5 + r4
            goto L4d
        L9f:
            yb.y r11 = yb.y.f14813a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.l0.c(k6.a, cd.i, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r6, ec.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kf.g0
            if (r0 == 0) goto L13
            r0 = r7
            kf.g0 r0 = (kf.g0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            kf.g0 r0 = new kf.g0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L2a
            java.lang.String r6 = r0.R
            p7.j.I(r7)
            goto L4b
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
            r6 = 0
            return r6
        L31:
            p7.j.I(r7)
            di.b r7 = new di.b
            r2 = 23
            r7.<init>(r2, r3, r5)
            cd.z0 r2 = new cd.z0
            r2.<init>(r7)
            r0.R = r6
            r0.Z = r4
            java.lang.Object r7 = cd.q.q(r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L51:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r7.next()
            r1 = r0
            ze.a r1 = (ze.a) r1
            android.content.Context r2 = r5.f8244a
            android.net.Uri r1 = r1.f15056d
            java.lang.String r1 = q8.r.y(r2, r1)
            boolean r1 = nc.k.a(r1, r6)
            if (r1 == 0) goto L51
            return r0
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.l0.d(java.lang.String, ec.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.net.Uri r14, ec.c r15) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.l0.e(android.net.Uri, ec.c):java.lang.Object");
    }

    public final void f() {
        if (this.f8253j.compareAndSet(true, false)) {
            this.f8252i.clear();
        }
        File file = new File(this.f8244a.getFilesDir(), "rom_data.json");
        if (file.isFile()) {
            file.delete();
        }
    }

    public final void g() {
        this.f8250g.p(this.f8252i);
    }
}
