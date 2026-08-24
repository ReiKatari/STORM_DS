package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uv2  reason: default package */
/* loaded from: classes.dex */
public final class uv2 {
    public final int a;

    public /* synthetic */ uv2(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.uv2
            if (r0 != 0) goto L5
            goto Ld
        L5:
            uv2 r2 = (defpackage.uv2) r2
            int r2 = r2.a
            int r1 = r1.a
            if (r1 == r2) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            r0 = 16
            int r1 = r1.a
            if (r1 != r0) goto L9
            java.lang.String r1 = "Confirm"
            return r1
        L9:
            r0 = 6
            if (r1 != r0) goto Lf
            java.lang.String r1 = "ContextClick"
            return r1
        Lf:
            r0 = 13
            if (r1 != r0) goto L16
            java.lang.String r1 = "GestureEnd"
            return r1
        L16:
            r0 = 23
            if (r1 != r0) goto L1d
            java.lang.String r1 = "GestureThresholdActivate"
            return r1
        L1d:
            r0 = 3
            if (r1 != r0) goto L23
            java.lang.String r1 = "KeyboardTap"
            return r1
        L23:
            if (r1 != 0) goto L28
            java.lang.String r1 = "LongPress"
            return r1
        L28:
            r0 = 17
            if (r1 != r0) goto L2f
            java.lang.String r1 = "Reject"
            return r1
        L2f:
            r0 = 27
            if (r1 != r0) goto L36
            java.lang.String r1 = "SegmentFrequentTick"
            return r1
        L36:
            r0 = 26
            if (r1 != r0) goto L3d
            java.lang.String r1 = "SegmentTick"
            return r1
        L3d:
            r0 = 9
            if (r1 != r0) goto L44
            java.lang.String r1 = "TextHandleMove"
            return r1
        L44:
            r0 = 22
            if (r1 != r0) goto L4b
            java.lang.String r1 = "ToggleOff"
            return r1
        L4b:
            r0 = 21
            if (r1 != r0) goto L52
            java.lang.String r1 = "ToggleOn"
            return r1
        L52:
            r0 = 1
            if (r1 != r0) goto L58
            java.lang.String r1 = "VirtualKey"
            return r1
        L58:
            java.lang.String r1 = "Invalid"
            return r1
    }
}
