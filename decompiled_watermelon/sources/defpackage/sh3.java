package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sh3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sh3 extends cv4 implements l93, ki2 {
    public final /* synthetic */ int c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh3(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.c0 = i2;
    }

    @Override // defpackage.d90
    public final e93 a() {
        q75.a.getClass();
        return this;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.c0;
        Object obj = this.B;
        switch (i) {
            case 0:
                return ((ae6) obj).getValue();
            case 1:
                return ((ae6) obj).getValue();
            case 2:
                return ((ae6) obj).getValue();
            default:
                return obj.getClass().getSimpleName();
        }
    }
}
