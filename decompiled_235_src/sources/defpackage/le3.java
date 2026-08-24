package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: le3  reason: default package */
/* loaded from: classes.dex */
public final class le3 extends me3 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public le3(String str, String str2) {
        super(str.concat(r3));
        String str3;
        if (str2 != null && !qs6.v0(str2)) {
            str3 = "\n".concat(str2);
        } else {
            str3 = "";
        }
    }

    public /* synthetic */ le3(String str, int i, String str2) {
        this(str, (i & 4) != 0 ? null : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
    }
}
