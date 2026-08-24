package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x86  reason: default package */
/* loaded from: classes.dex */
public final class x86 {
    public static final java.util.List a = null;

    static {
            java.lang.String r0 = "WebRTC_ScreenCapture"
            java.lang.String r1 = "StormScreenCapture"
            java.lang.String r2 = "HiddenDisplay"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.x86.a = r0
            return
    }

    public static android.view.Display a(defpackage.jq r7) {
            android.view.Display r0 = defpackage.ge7.D(r7)
            r0.getClass()
            java.lang.Class<android.hardware.display.DisplayManager> r1 = android.hardware.display.DisplayManager.class
            java.lang.Object r7 = r7.getSystemService(r1)
            android.hardware.display.DisplayManager r7 = (android.hardware.display.DisplayManager) r7
            if (r7 == 0) goto L57
            java.lang.String r1 = "android.hardware.display.category.PRESENTATION"
            android.view.Display[] r7 = r7.getDisplays(r1)
            r7.getClass()
            int r1 = r7.length
            r2 = 0
        L1c:
            if (r2 >= r1) goto L57
            r3 = r7[r2]
            java.lang.String r4 = r3.getName()
            if (r4 != 0) goto L28
            java.lang.String r4 = ""
        L28:
            int r5 = r3.getDisplayId()
            int r6 = r0.getDisplayId()
            if (r5 == r6) goto L54
            java.util.List r5 = defpackage.x86.a
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto L54
            java.lang.String r5 = "ScreenCapture"
            r6 = 1
            boolean r5 = defpackage.qs6.j0(r4, r5, r6)
            if (r5 != 0) goto L54
            java.lang.String r5 = "Virtual"
            boolean r5 = defpackage.qs6.j0(r4, r5, r6)
            if (r5 != 0) goto L54
            java.lang.String r5 = "Record"
            boolean r4 = defpackage.qs6.j0(r4, r5, r6)
            if (r4 != 0) goto L54
            return r3
        L54:
            int r2 = r2 + 1
            goto L1c
        L57:
            r7 = 0
            return r7
    }
}
