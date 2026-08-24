package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zv2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zv2 extends defpackage.po2 implements defpackage.eo2 {
    public static final defpackage.zv2 d0 = null;

    static {
            zv2 r0 = new zv2
            java.lang.String r4 = "logHardcoreSubmissionQueueTrace(Ljava/lang/String;Ljava/util/List;)V"
            r5 = 1
            r1 = 2
            java.lang.Class<jw2> r2 = defpackage.jw2.class
            java.lang.String r3 = "logHardcoreSubmissionQueueTrace"
            r0.<init>(r1, r2, r3, r4, r5)
            defpackage.zv2.d0 = r0
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            java.lang.String r3 = (java.lang.String) r3
            java.util.List r4 = (java.util.List) r4
            r3.getClass()
            r4.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "event_type="
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r3 = " submit_path=hardcore_queue"
            r2.append(r3)
            java.util.Iterator r3 = r4.iterator()
        L1d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r3.next()
            vr4 r4 = (defpackage.vr4) r4
            java.lang.Object r0 = r4.A
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = r4.B
            if (r4 == 0) goto L1d
            r1 = 32
            r2.append(r1)
            r2.append(r0)
            r0 = 61
            r2.append(r0)
            java.lang.String r4 = r4.toString()
            r0 = 95
            java.lang.String r4 = defpackage.xs6.d0(r4, r1, r0)
            r2.append(r4)
            goto L1d
        L4c:
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RATrace"
            android.util.Log.i(r3, r2)
            jg7 r2 = defpackage.jg7.a
            return r2
    }
}
