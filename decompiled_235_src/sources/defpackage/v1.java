package defpackage;

import java.util.function.IntUnaryOperator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements IntUnaryOperator {
    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        if (i <= Integer.MAX_VALUE) {
            return i;
        }
        throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i), Integer.MAX_VALUE));
    }
}
