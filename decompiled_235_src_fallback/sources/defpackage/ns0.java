package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ns0  reason: default package */
/* loaded from: classes.dex */
public final class ns0 extends java.io.IOException {
    public ns0(java.lang.IndexOutOfBoundsException r2) {
            r1 = this;
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
            r1.<init>(r0, r2)
            return
    }

    public ns0(java.lang.String r2, java.lang.IndexOutOfBoundsException r3) {
            r1 = this;
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            java.lang.String r2 = r0.concat(r2)
            r1.<init>(r2, r3)
            return
    }
}
