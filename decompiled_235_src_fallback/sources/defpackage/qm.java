package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qm  reason: default package */
/* loaded from: classes.dex */
public final class qm extends java.lang.ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ qm(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // java.lang.ThreadLocal
    public final java.lang.Object initialValue() {
            r3 = this;
            int r3 = r3.a
            r0 = 0
            switch(r3) {
                case 0: goto L54;
                case 1: goto L4c;
                case 2: goto L39;
                case 3: goto L33;
                case 4: goto Lf;
                default: goto L6;
            }
        L6:
            java.security.SecureRandom r3 = new java.security.SecureRandom
            r3.<init>()
            r3.nextLong()
            return r3
        Lf:
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r3 != r1) goto L1e
            ov2 r0 = defpackage.u24.x()
            goto L32
        L1e:
            android.os.Looper r3 = android.os.Looper.myLooper()
            if (r3 == 0) goto L32
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.myLooper()
            r3.<init>(r0)
            ov2 r0 = new ov2
            r0.<init>(r3)
        L32:
            return r0
        L33:
            java.util.Random r3 = new java.util.Random
            r3.<init>()
            return r3
        L39:
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r0 = "EEE, dd MMM yyyy HH:mm:ss 'GMT'"
            java.util.Locale r1 = java.util.Locale.US
            r3.<init>(r0, r1)
            r0 = 0
            r3.setLenient(r0)
            java.util.TimeZone r0 = defpackage.az7.a
            r3.setTimeZone(r0)
            return r3
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Picasso-"
            r3.<init>(r0)
            return r3
        L54:
            sm r3 = new sm
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 == 0) goto L6e
            android.os.Handler r0 = defpackage.uj2.u(r2)
            r3.<init>(r1, r0)
            um r0 = r3.h0
            l61 r0 = defpackage.jw2.y(r3, r0)
            goto L73
        L6e:
            java.lang.String r3 = "no Looper on this thread"
            defpackage.i.m(r3)
        L73:
            return r0
    }
}
