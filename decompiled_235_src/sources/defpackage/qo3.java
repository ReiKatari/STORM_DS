package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qo3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qo3 extends j45 implements fg3, on2 {
    public final /* synthetic */ int d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qo3(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.d0 = i2;
    }

    @Override // defpackage.lb0
    public final yf3 a() {
        gh5.a.getClass();
        return this;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.d0;
        Object obj = this.B;
        switch (i) {
            case 0:
                return ((pp6) obj).getValue();
            case 1:
                return ((pp6) obj).getValue();
            case 2:
                return ((pp6) obj).getValue();
            default:
                return obj.getClass().getSimpleName();
        }
    }
}
