package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i31  reason: default package */
/* loaded from: classes.dex */
public abstract class i31 {
    public static final List a;

    static {
        try {
            a = d06.A0(d06.w0(Arrays.asList(new zg()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
