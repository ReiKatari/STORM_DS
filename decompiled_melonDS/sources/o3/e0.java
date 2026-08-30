package o3;

import n2.f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 extends c0 {

    /* renamed from: b  reason: collision with root package name */
    public final c f10718b;

    /* renamed from: c  reason: collision with root package name */
    public String f10719c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10720d;

    /* renamed from: e  reason: collision with root package name */
    public final a f10721e;

    /* renamed from: f  reason: collision with root package name */
    public nc.l f10722f;

    /* renamed from: g  reason: collision with root package name */
    public final f1 f10723g;

    /* renamed from: h  reason: collision with root package name */
    public i3.l f10724h;

    /* renamed from: i  reason: collision with root package name */
    public final f1 f10725i;

    /* renamed from: j  reason: collision with root package name */
    public long f10726j;

    /* renamed from: k  reason: collision with root package name */
    public float f10727k;

    /* renamed from: l  reason: collision with root package name */
    public float f10728l;
    public final d0 m;

    public e0(c cVar) {
        this.f10718b = cVar;
        cVar.f10686i = new d0(this, 0);
        this.f10719c = "";
        this.f10720d = true;
        this.f10721e = new a();
        this.f10722f = g.R;
        this.f10723g = n2.s.w(null);
        this.f10725i = n2.s.w(new h3.e(0L));
        this.f10726j = 9205357640488583168L;
        this.f10727k = 1.0f;
        this.f10728l = 1.0f;
        this.m = new d0(this, 1);
    }

    @Override // o3.c0
    public final void a(k3.d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        if (r3 != r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0108, code lost:
        if (r9.f10672d == r3) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(k3.d r31, float r32, i3.l r33) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.e0.e(k3.d, float, i3.l):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f10719c);
        sb2.append("\n\tviewportWidth: ");
        f1 f1Var = this.f10725i;
        sb2.append(Float.intBitsToFloat((int) (((h3.e) f1Var.getValue()).f6064a >> 32)));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(Float.intBitsToFloat((int) (((h3.e) f1Var.getValue()).f6064a & 4294967295L)));
        sb2.append("\n");
        return sb2.toString();
    }
}
