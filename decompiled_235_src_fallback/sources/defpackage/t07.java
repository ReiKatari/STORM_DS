package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t07  reason: default package */
/* loaded from: classes.dex */
public enum t07 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.t07[] $VALUES = null;
    public static final defpackage.t07 Autofill = null;
    public static final defpackage.t07 Copy = null;
    public static final defpackage.t07 Cut = null;
    public static final defpackage.t07 Paste = null;
    public static final defpackage.t07 SelectAll = null;
    private final int drawableId;
    private final java.lang.Object key;
    private final int stringId;

    private static final /* synthetic */ defpackage.t07[] $values() {
            t07 r0 = defpackage.t07.Cut
            t07 r1 = defpackage.t07.Copy
            t07 r2 = defpackage.t07.Paste
            t07 r3 = defpackage.t07.SelectAll
            t07 r4 = defpackage.t07.Autofill
            t07[] r0 = new defpackage.t07[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            t07 r0 = new t07
            java.lang.Object r3 = defpackage.nc1.i
            r4 = 17039363(0x1040003, float:2.424458E-38)
            r5 = 16843537(0x1010311, float:2.3695758E-38)
            java.lang.String r1 = "Cut"
            r2 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            defpackage.t07.Cut = r0
            t07 r1 = new t07
            java.lang.Object r4 = defpackage.nc1.j
            r5 = 17039361(0x1040001, float:2.4244574E-38)
            r6 = 16843538(0x1010312, float:2.369576E-38)
            java.lang.String r2 = "Copy"
            r3 = 1
            r1.<init>(r2, r3, r4, r5, r6)
            defpackage.t07.Copy = r1
            t07 r2 = new t07
            java.lang.Object r5 = defpackage.nc1.k
            r6 = 17039371(0x104000b, float:2.4244602E-38)
            r7 = 16843539(0x1010313, float:2.3695764E-38)
            java.lang.String r3 = "Paste"
            r4 = 2
            r2.<init>(r3, r4, r5, r6, r7)
            defpackage.t07.Paste = r2
            t07 r3 = new t07
            java.lang.Object r6 = defpackage.nc1.l
            r7 = 17039373(0x104000d, float:2.4244607E-38)
            r8 = 16843646(0x101037e, float:2.3696064E-38)
            java.lang.String r4 = "SelectAll"
            r5 = 3
            r3.<init>(r4, r5, r6, r7, r8)
            defpackage.t07.SelectAll = r3
            t07 r4 = new t07
            java.lang.Object r7 = defpackage.nc1.m
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 > r1) goto L57
            r0 = 2131951692(0x7f13004c, float:1.9539806E38)
        L55:
            r8 = r0
            goto L5b
        L57:
            r0 = 17039386(0x104001a, float:2.4244644E-38)
            goto L55
        L5b:
            r9 = 0
            java.lang.String r5 = "Autofill"
            r6 = 4
            r4.<init>(r5, r6, r7, r8, r9)
            defpackage.t07.Autofill = r4
            t07[] r0 = $values()
            defpackage.t07.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.t07.$ENTRIES = r0
            return
    }

    t07(java.lang.String r1, int r2, java.lang.Object r3, int r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.key = r3
            r0.stringId = r4
            r0.drawableId = r5
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.t07.$ENTRIES
            return r0
    }

    public static defpackage.t07 valueOf(java.lang.String r1) {
            java.lang.Class<t07> r0 = defpackage.t07.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            t07 r1 = (defpackage.t07) r1
            return r1
    }

    public static defpackage.t07[] values() {
            t07[] r0 = defpackage.t07.$VALUES
            java.lang.Object r0 = r0.clone()
            t07[] r0 = (defpackage.t07[]) r0
            return r0
    }

    /* renamed from: getDrawableId-3I4p1mQ  reason: not valid java name */
    public final int m8getDrawableId3I4p1mQ() {
            r0 = this;
            int r0 = r0.drawableId
            return r0
    }

    public final java.lang.Object getKey() {
            r0 = this;
            java.lang.Object r0 = r0.key
            return r0
    }

    /* renamed from: getStringId-9Hzcbyc  reason: not valid java name */
    public final int m9getStringId9Hzcbyc() {
            r0 = this;
            int r0 = r0.stringId
            return r0
    }

    public final java.lang.String resolvedString(defpackage.px0 r1, int r2) {
            r0 = this;
            int r0 = r0.stringId
            py0 r2 = defpackage.kf.c
            xq2 r1 = (defpackage.xq2) r1
            java.lang.Object r1 = r1.j(r2)
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            java.lang.String r0 = r1.getString(r0)
            return r0
    }
}
