package defpackage;

import androidx.preference.Preference;
import java.util.function.IntUnaryOperator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u1 implements IntUnaryOperator {
    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        if (i <= Integer.MAX_VALUE) {
            return i;
        }
        throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i), Integer.valueOf((int) Preference.DEFAULT_ORDER)));
    }
}
