package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p61  reason: default package */
/* loaded from: classes.dex */
public abstract class p61 {
    public static final List a;

    static {
        try {
            a = sb6.c0(sb6.Y(Arrays.asList(new lh()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
