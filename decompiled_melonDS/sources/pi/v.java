package pi;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends b0 {

    /* renamed from: f  reason: collision with root package name */
    public static final t f11797f;

    /* renamed from: g  reason: collision with root package name */
    public static final t f11798g;

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f11799h;

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f11800i;

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f11801j;

    /* renamed from: b  reason: collision with root package name */
    public final fj.h f11802b;

    /* renamed from: c  reason: collision with root package name */
    public final List f11803c;

    /* renamed from: d  reason: collision with root package name */
    public final t f11804d;

    /* renamed from: e  reason: collision with root package name */
    public long f11805e;

    static {
        vc.f fVar = t.f11790d;
        f11797f = p7.n.i("multipart/mixed");
        p7.n.i("multipart/alternative");
        p7.n.i("multipart/digest");
        p7.n.i("multipart/parallel");
        f11798g = p7.n.i("multipart/form-data");
        f11799h = new byte[]{58, 32};
        f11800i = new byte[]{13, 10};
        f11801j = new byte[]{45, 45};
    }

    public v(fj.h hVar, t tVar, List list) {
        hVar.getClass();
        tVar.getClass();
        this.f11802b = hVar;
        this.f11803c = list;
        vc.f fVar = t.f11790d;
        this.f11804d = p7.n.i(tVar + "; boundary=" + hVar.r());
        this.f11805e = -1L;
    }

    @Override // pi.b0
    public final long a() {
        long j2 = this.f11805e;
        if (j2 == -1) {
            long e6 = e(null, true);
            this.f11805e = e6;
            return e6;
        }
        return j2;
    }

    @Override // pi.b0
    public final t b() {
        return this.f11804d;
    }

    @Override // pi.b0
    public final boolean c() {
        List<u> list = this.f11803c;
        if (!list.isEmpty()) {
            for (u uVar : list) {
                if (uVar.f11796b.c()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // pi.b0
    public final void d(fj.f fVar) {
        e(fVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(fj.f fVar, boolean z10) {
        fj.e eVar;
        fj.f fVar2;
        if (z10) {
            Object obj = new Object();
            eVar = obj;
            fVar2 = obj;
        } else {
            eVar = null;
            fVar2 = fVar;
        }
        List list = this.f11803c;
        int size = list.size();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            fj.h hVar = this.f11802b;
            byte[] bArr = f11801j;
            byte[] bArr2 = f11800i;
            if (i2 < size) {
                u uVar = (u) list.get(i2);
                q qVar = uVar.f11795a;
                b0 b0Var = uVar.f11796b;
                fVar2.getClass();
                fVar2.write(bArr);
                fVar2.p(hVar);
                fVar2.write(bArr2);
                int size2 = qVar.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    fVar2.P(qVar.b(i10)).write(f11799h).P(qVar.d(i10)).write(bArr2);
                }
                t b10 = b0Var.b();
                if (b10 != null) {
                    fVar2.P("Content-Type: ").P(b10.f11792a).write(bArr2);
                }
                long a10 = b0Var.a();
                if (a10 == -1 && z10) {
                    eVar.getClass();
                    eVar.t();
                    return -1L;
                }
                fVar2.write(bArr2);
                if (z10) {
                    j2 += a10;
                } else {
                    b0Var.d(fVar2);
                }
                fVar2.write(bArr2);
                i2++;
            } else {
                fVar2.getClass();
                fVar2.write(bArr);
                fVar2.p(hVar);
                fVar2.write(bArr);
                fVar2.write(bArr2);
                if (z10) {
                    eVar.getClass();
                    long j10 = j2 + eVar.B;
                    eVar.t();
                    return j10;
                }
                return j2;
            }
        }
    }
}
