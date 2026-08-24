package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u2  reason: default package */
/* loaded from: classes.dex */
public final class u2 implements defpackage.sv0 {
    public static defpackage.u2 c;
    public final /* synthetic */ int a;
    public java.lang.Object b;

    public u2() {
            r3 = this;
            r0 = 6
            r3.a = r0
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.b = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            kl6 r2 = new kl6
            r2.<init>(r3)
            r0.<init>(r1, r2)
            return
    }

    public u2(android.content.Context r1, defpackage.d90 r2) {
            r0 = this;
            r2 = 3
            r0.a = r2
            r0.<init>()
            r0.b = r1
            return
    }

    public /* synthetic */ u2(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    public static defpackage.u2 b(boolean r7, int r8, int r9, int r10, int r11) {
            u2 r0 = new u2
            r5 = 0
            r6 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r7 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r1, r2, r3, r4, r5, r6)
            r8 = 0
            r0.<init>(r7, r8)
            return r0
    }

    public java.util.ArrayList a() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r6 = r6.b
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Class<com.google.mlkit.common.internal.MlKitComponentDiscoveryService> r1 = com.google.mlkit.common.internal.MlKitComponentDiscoveryService.class
            java.lang.String r2 = "ComponentDiscovery"
            r3 = 0
            android.content.pm.PackageManager r4 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            if (r4 != 0) goto L1a
            java.lang.String r6 = "Context has no PackageManager."
            android.util.Log.w(r2, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            goto L44
        L1a:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            r5.<init>(r6, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            r6 = 128(0x80, float:1.8E-43)
            android.content.pm.ServiceInfo r6 = r4.getServiceInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            if (r6 != 0) goto L3c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            r6.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            r6.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            java.lang.String r1 = " has no service info."
            r6.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            java.lang.String r6 = r6.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            android.util.Log.w(r2, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            goto L44
        L3c:
            android.os.Bundle r3 = r6.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3f
            goto L44
        L3f:
            java.lang.String r6 = "Application info not found."
            android.util.Log.w(r2, r6)
        L44:
            if (r3 != 0) goto L4e
            java.lang.String r6 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r2, r6)
            java.util.List r6 = java.util.Collections.EMPTY_LIST
            goto L85
        L4e:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Set r1 = r3.keySet()
            java.util.Iterator r1 = r1.iterator()
        L5b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L85
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r3.get(r2)
            java.lang.String r5 = "com.google.firebase.components.ComponentRegistrar"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L5b
            java.lang.String r4 = "com.google.firebase.components:"
            boolean r4 = r2.startsWith(r4)
            if (r4 == 0) goto L5b
            r4 = 31
            java.lang.String r2 = r2.substring(r4)
            r6.add(r2)
            goto L5b
        L85:
            java.util.Iterator r6 = r6.iterator()
        L89:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L9f
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            rv0 r2 = new rv0
            r3 = 0
            r2.<init>(r1, r3)
            r0.add(r2)
            goto L89
        L9f:
            return r0
    }

    @Override // defpackage.sv0
    public java.lang.Object create(defpackage.ov0 r1) {
            r0 = this;
            java.lang.Object r0 = r0.b
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 4: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = super.toString()
            return r3
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Result: <"
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Value: "
            r1.<init>(r2)
            java.lang.Object r3 = r3.b
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
            java.lang.String r3 = ">]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
