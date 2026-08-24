package defpackage;

import java.util.function.Function;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bu implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ bu(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(Integer.parseInt((String) obj));
            case 1:
                return Boolean.valueOf(Boolean.parseBoolean((String) obj));
            default:
                Integer num = (Integer) obj;
                return new Object();
        }
    }
}
