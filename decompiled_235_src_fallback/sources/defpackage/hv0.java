package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hv0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hv0 implements defpackage.ml4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.mv0 b;

    public /* synthetic */ hv0(defpackage.mv0 r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ml4
    public final void a(defpackage.mv0 r10) {
            r9 = this;
            int r0 = r9.a
            mv0 r9 = r9.b
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            jq r9 = (defpackage.jq) r9
            d51 r9 = r9.r0
            java.lang.Object r9 = r9.B
            vk2 r9 = (defpackage.vk2) r9
            ll2 r10 = r9.R
            r0 = 0
            r10.b(r9, r9, r0)
            return
        L16:
            r10.getClass()
            e56 r10 = r9.R
            d56 r10 = r10.b
            java.lang.String r0 = "android:support:activity-result"
            android.os.Bundle r10 = r10.a(r0)
            if (r10 == 0) goto La5
            kv0 r9 = r9.e0
            java.util.LinkedHashMap r0 = r9.b
            java.util.LinkedHashMap r1 = r9.a
            android.os.Bundle r2 = r9.g
            java.lang.String r3 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
            java.util.ArrayList r3 = r10.getIntegerArrayList(r3)
            java.lang.String r4 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
            java.util.ArrayList r4 = r10.getStringArrayList(r4)
            if (r4 == 0) goto La5
            if (r3 != 0) goto L3e
            goto La5
        L3e:
            java.lang.String r5 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
            java.util.ArrayList r5 = r10.getStringArrayList(r5)
            if (r5 == 0) goto L4b
            java.util.ArrayList r6 = r9.d
            r6.addAll(r5)
        L4b:
            java.lang.String r5 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
            android.os.Bundle r10 = r10.getBundle(r5)
            if (r10 == 0) goto L56
            r2.putAll(r10)
        L56:
            int r10 = r4.size()
            r5 = 0
        L5b:
            if (r5 >= r10) goto La5
            java.lang.Object r6 = r4.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = r0.containsKey(r6)
            if (r7 == 0) goto L7c
            java.lang.Object r7 = r0.remove(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            boolean r6 = r2.containsKey(r6)
            if (r6 != 0) goto L7c
            java.util.Map r6 = defpackage.ge7.n(r1)
            r6.remove(r7)
        L7c:
            java.lang.Object r6 = r3.get(r5)
            r6.getClass()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r7 = r4.get(r5)
            r7.getClass()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r1.put(r8, r7)
            java.util.LinkedHashMap r8 = r9.b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.put(r7, r6)
            int r5 = r5 + 1
            goto L5b
        La5:
            return
    }
}
