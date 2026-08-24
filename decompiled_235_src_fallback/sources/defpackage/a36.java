package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a36  reason: default package */
/* loaded from: classes.dex */
public enum a36 extends java.lang.Enum implements defpackage.v26 {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.a36[] $VALUES = null;
    public static final defpackage.a36 BLOW = null;
    public static final defpackage.a36 DEFAULT = null;
    public static final defpackage.a36 DEVICE = null;
    public static final defpackage.a36 NONE = null;
    private final me.magnum.melonds.domain.model.MicSource micSource;

    private static final /* synthetic */ defpackage.a36[] $values() {
            a36 r0 = defpackage.a36.DEFAULT
            a36 r1 = defpackage.a36.NONE
            a36 r2 = defpackage.a36.BLOW
            a36 r3 = defpackage.a36.DEVICE
            a36[] r0 = new defpackage.a36[]{r0, r1, r2, r3}
            return r0
    }

    static {
            a36 r0 = new a36
            r1 = 0
            r2 = 0
            java.lang.String r3 = "DEFAULT"
            r0.<init>(r3, r1, r2)
            defpackage.a36.DEFAULT = r0
            a36 r0 = new a36
            r1 = 1
            me.magnum.melonds.domain.model.MicSource r2 = me.magnum.melonds.domain.model.MicSource.NONE
            java.lang.String r3 = "NONE"
            r0.<init>(r3, r1, r2)
            defpackage.a36.NONE = r0
            a36 r0 = new a36
            r1 = 2
            me.magnum.melonds.domain.model.MicSource r2 = me.magnum.melonds.domain.model.MicSource.BLOW
            java.lang.String r3 = "BLOW"
            r0.<init>(r3, r1, r2)
            defpackage.a36.BLOW = r0
            a36 r0 = new a36
            r1 = 3
            me.magnum.melonds.domain.model.MicSource r2 = me.magnum.melonds.domain.model.MicSource.DEVICE
            java.lang.String r3 = "DEVICE"
            r0.<init>(r3, r1, r2)
            defpackage.a36.DEVICE = r0
            a36[] r0 = $values()
            defpackage.a36.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.a36.$ENTRIES = r0
            return
    }

    a36(java.lang.String r1, int r2, me.magnum.melonds.domain.model.MicSource r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.micSource = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.a36.$ENTRIES
            return r0
    }

    public static defpackage.a36 valueOf(java.lang.String r1) {
            java.lang.Class<a36> r0 = defpackage.a36.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            a36 r1 = (defpackage.a36) r1
            return r1
    }

    public static defpackage.a36[] values() {
            a36[] r0 = defpackage.a36.$VALUES
            java.lang.Object r0 = r0.clone()
            a36[] r0 = (defpackage.a36[]) r0
            return r0
    }

    @Override // defpackage.v26
    public defpackage.a36 getDefault() {
            r0 = this;
            a36 r0 = defpackage.a36.DEFAULT
            return r0
    }

    @Override // defpackage.v26
    public /* bridge */ /* synthetic */ java.lang.Object getDefault() {
            r0 = this;
            a36 r0 = r0.getDefault()
            return r0
    }

    public final me.magnum.melonds.domain.model.MicSource getMicSource() {
            r0 = this;
            me.magnum.melonds.domain.model.MicSource r0 = r0.micSource
            return r0
    }

    @Override // defpackage.v26
    public /* bridge */ /* synthetic */ java.lang.Object getValue() {
            r0 = this;
            me.magnum.melonds.domain.model.MicSource r0 = r0.getValue()
            return r0
    }

    @Override // defpackage.v26
    public me.magnum.melonds.domain.model.MicSource getValue() {
            r0 = this;
            me.magnum.melonds.domain.model.MicSource r0 = r0.micSource
            r0.getClass()
            return r0
    }
}
