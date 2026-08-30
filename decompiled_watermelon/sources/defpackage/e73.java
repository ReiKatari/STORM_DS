package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e73  reason: default package */
/* loaded from: classes.dex */
public final class e73 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final po0 f;
    public final boolean g;

    public e73(boolean z, boolean z2, String str, String str2, boolean z3, po0 po0Var, boolean z4) {
        str.getClass();
        str2.getClass();
        po0Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
        this.f = po0Var;
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
        return ej6.h(sb, this.g, ')');
    }
}
