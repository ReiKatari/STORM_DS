package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: td3  reason: default package */
/* loaded from: classes.dex */
public final class td3 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final zq0 f;
    public final boolean g;

    public td3(boolean z, boolean z2, String str, String str2, boolean z3, zq0 zq0Var, boolean z4) {
        str.getClass();
        str2.getClass();
        zq0Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
        this.f = zq0Var;
        this.g = z4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=");
        sb.append(this.a);
        sb.append(", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=");
        sb.append(this.b);
        sb.append(", prettyPrintIndent='");
        sb.append(this.c);
        sb.append("', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='");
        sb.append(this.d);
        sb.append("', allowSpecialFloatingPointValues=false, useAlternativeNames=");
        sb.append(this.e);
        sb.append(", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        sb.append(this.f);
        sb.append(", exceptionsWithDebugInfo=");
        return xg6.r(sb, this.g, ')');
    }
}
