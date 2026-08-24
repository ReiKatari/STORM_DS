package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kd7  reason: default package */
/* loaded from: classes.dex */
public class kd7 extends defpackage.yc7 {
    public kd7() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "java-lang-class-unsupported"
            java.lang.String r0 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee "
            java.lang.String r2 = r0.concat(r2)
            r1.<init>(r2)
            throw r1
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Attempted to serialize java.lang.Class: "
            r2.<init>(r0)
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ". Forgot to register a type adapter?\nSee "
            r2.append(r3)
            java.lang.String r3 = "java-lang-class-unsupported"
            java.lang.String r0 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r3 = r0.concat(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
