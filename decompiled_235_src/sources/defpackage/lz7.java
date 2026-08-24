package defpackage;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lz7  reason: default package */
/* loaded from: classes.dex */
public abstract class lz7 {
    public static final ez7 a;
    public static final Api b;

    /* JADX WARN: Type inference failed for: r2v0, types: [ez7, com.google.android.gms.common.api.Api$AbstractClientBuilder] */
    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        Api.ClientKey clientKey2 = new Api.ClientKey();
        ?? abstractClientBuilder = new Api.AbstractClientBuilder();
        a = abstractClientBuilder;
        Api.AbstractClientBuilder abstractClientBuilder2 = new Api.AbstractClientBuilder();
        new Scope(Scopes.PROFILE);
        new Scope(Scopes.EMAIL);
        b = new Api("SignIn.API", abstractClientBuilder, clientKey);
        new Api("SignIn.INTERNAL_API", abstractClientBuilder2, clientKey2);
    }
}
