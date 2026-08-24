package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dv0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dv0 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.mv0 B;

    public /* synthetic */ dv0(defpackage.mv0 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r4 = this;
            int r0 = r4.A
            r1 = 0
            mv0 r4 = r4.B
            switch(r0) {
                case 0: goto L79;
                case 1: goto L6c;
                case 2: goto L5f;
                case 3: goto L45;
                default: goto L8;
            }
        L8:
            il4 r0 = new il4
            cv0 r2 = new cv0
            r2.<init>(r4, r1)
            r0.<init>(r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L44
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L3a
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            mf r2 = new mf
            r3 = 12
            r2.<init>(r3, r4, r0)
            r1.post(r2)
            goto L44
        L3a:
            ku3 r1 = r4.A
            ev0 r2 = new ev0
            r2.<init>(r0, r4)
            r1.a(r2)
        L44:
            return r0
        L45:
            h56 r0 = new h56
            android.app.Application r1 = r4.getApplication()
            android.content.Intent r2 = r4.getIntent()
            if (r2 == 0) goto L5a
            android.content.Intent r2 = r4.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            goto L5b
        L5a:
            r2 = 0
        L5b:
            r0.<init>(r1, r4, r2)
            return r0
        L5f:
            vj1 r0 = new vj1
            r0.<init>()
            eb r4 = r4.a()
            r4.f(r0)
            return r0
        L6c:
            nn2 r0 = new nn2
            jv0 r2 = r4.Y
            dv0 r3 = new dv0
            r3.<init>(r4, r1)
            r0.<init>(r2, r3)
            return r0
        L79:
            r4.reportFullyDrawn()
            jg7 r4 = defpackage.jg7.a
            return r4
    }
}
