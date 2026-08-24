package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum AudioInterpolation extends java.lang.Enum<me.magnum.melonds.domain.model.AudioInterpolation> {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ me.magnum.melonds.domain.model.AudioInterpolation[] $VALUES = null;
    public static final me.magnum.melonds.domain.model.AudioInterpolation COSINE = null;
    public static final me.magnum.melonds.domain.model.AudioInterpolation CUBIC = null;
    public static final me.magnum.melonds.domain.model.AudioInterpolation LINEAR = null;
    public static final me.magnum.melonds.domain.model.AudioInterpolation NONE = null;
    private final int interpolationValue;

    private static final /* synthetic */ me.magnum.melonds.domain.model.AudioInterpolation[] $values() {
            me.magnum.melonds.domain.model.AudioInterpolation r0 = me.magnum.melonds.domain.model.AudioInterpolation.NONE
            me.magnum.melonds.domain.model.AudioInterpolation r1 = me.magnum.melonds.domain.model.AudioInterpolation.LINEAR
            me.magnum.melonds.domain.model.AudioInterpolation r2 = me.magnum.melonds.domain.model.AudioInterpolation.COSINE
            me.magnum.melonds.domain.model.AudioInterpolation r3 = me.magnum.melonds.domain.model.AudioInterpolation.CUBIC
            me.magnum.melonds.domain.model.AudioInterpolation[] r0 = new me.magnum.melonds.domain.model.AudioInterpolation[]{r0, r1, r2, r3}
            return r0
    }

    static {
            me.magnum.melonds.domain.model.AudioInterpolation r0 = new me.magnum.melonds.domain.model.AudioInterpolation
            java.lang.String r1 = "NONE"
            r2 = 0
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.AudioInterpolation.NONE = r0
            me.magnum.melonds.domain.model.AudioInterpolation r0 = new me.magnum.melonds.domain.model.AudioInterpolation
            java.lang.String r1 = "LINEAR"
            r2 = 1
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.AudioInterpolation.LINEAR = r0
            me.magnum.melonds.domain.model.AudioInterpolation r0 = new me.magnum.melonds.domain.model.AudioInterpolation
            java.lang.String r1 = "COSINE"
            r2 = 2
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.AudioInterpolation.COSINE = r0
            me.magnum.melonds.domain.model.AudioInterpolation r0 = new me.magnum.melonds.domain.model.AudioInterpolation
            java.lang.String r1 = "CUBIC"
            r2 = 3
            r0.<init>(r1, r2, r2)
            me.magnum.melonds.domain.model.AudioInterpolation.CUBIC = r0
            me.magnum.melonds.domain.model.AudioInterpolation[] r0 = $values()
            me.magnum.melonds.domain.model.AudioInterpolation.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            me.magnum.melonds.domain.model.AudioInterpolation.$ENTRIES = r0
            return
    }

    AudioInterpolation(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.interpolationValue = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = me.magnum.melonds.domain.model.AudioInterpolation.$ENTRIES
            return r0
    }

    public static me.magnum.melonds.domain.model.AudioInterpolation valueOf(java.lang.String r1) {
            java.lang.Class<me.magnum.melonds.domain.model.AudioInterpolation> r0 = me.magnum.melonds.domain.model.AudioInterpolation.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            me.magnum.melonds.domain.model.AudioInterpolation r1 = (me.magnum.melonds.domain.model.AudioInterpolation) r1
            return r1
    }

    public static me.magnum.melonds.domain.model.AudioInterpolation[] values() {
            me.magnum.melonds.domain.model.AudioInterpolation[] r0 = me.magnum.melonds.domain.model.AudioInterpolation.$VALUES
            java.lang.Object r0 = r0.clone()
            me.magnum.melonds.domain.model.AudioInterpolation[] r0 = (me.magnum.melonds.domain.model.AudioInterpolation[]) r0
            return r0
    }

    public final int getInterpolationValue() {
            r0 = this;
            int r0 = r0.interpolationValue
            return r0
    }
}
