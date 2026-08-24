package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jg  reason: default package */
/* loaded from: classes.dex */
public final class jg extends aj3 implements eo2 {
    public final /* synthetic */ on2 B;
    public final /* synthetic */ jj1 L;
    public final /* synthetic */ zv0 R;
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg(on2 on2Var, jj1 jj1Var, zv0 zv0Var, int i, int i2) {
        super(2);
        this.B = on2Var;
        this.L = jj1Var;
        this.R = zv0Var;
        this.X = i;
        this.Y = i2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        nw7.o(this.B, this.L, this.R, (px0) obj, ii2.a0(this.X | 1), this.Y);
        return jg7.a;
    }
}
