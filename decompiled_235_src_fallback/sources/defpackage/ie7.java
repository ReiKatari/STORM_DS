package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ie7  reason: default package */
/* loaded from: classes.dex */
public class ie7<T> {
    public final java.lang.Class a;
    public final java.lang.reflect.Type b;
    public final int c;

    public ie7() {
            r4 = this;
            r4.<init>()
            java.lang.Class r0 = r4.getClass()
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            java.lang.Class<ie7> r3 = defpackage.ie7.class
            if (r1 == 0) goto L45
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r1 = r0.getRawType()
            if (r1 != r3) goto L59
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            java.lang.reflect.Type r0 = defpackage.q60.l(r0)
            java.lang.String r1 = "gson.allowCapturingTypeVariables"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r2 = "true"
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 != 0) goto L36
            a(r0)
        L36:
            r4.b = r0
            java.lang.Class r1 = defpackage.q60.J(r0)
            r4.a = r1
            int r0 = r0.hashCode()
            r4.c = r0
            return
        L45:
            if (r0 != r3) goto L59
            java.lang.String r4 = "type-token-raw"
            java.lang.String r0 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r4 = r0.concat(r4)
            java.lang.String r0 = "TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee "
            java.lang.String r4 = r0.concat(r4)
            defpackage.i.m(r4)
            throw r2
        L59:
            java.lang.String r4 = "Must only create direct subclasses of TypeToken"
            defpackage.i.m(r4)
            throw r2
    }

    public ie7(java.lang.reflect.Type r2) {
            r1 = this;
            r1.<init>()
            java.util.Objects.requireNonNull(r2)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.reflect.Type r2 = defpackage.q60.l(r2)
            r1.b = r2
            java.lang.Class r0 = defpackage.q60.J(r2)
            r1.a = r0
            int r2 = r2.hashCode()
            r1.c = r2
            return
    }

    public static void a(java.lang.reflect.Type r5) {
            boolean r0 = r5 instanceof java.lang.reflect.TypeVariable
            if (r0 != 0) goto L60
            boolean r0 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L12
            java.lang.reflect.GenericArrayType r5 = (java.lang.reflect.GenericArrayType) r5
            java.lang.reflect.Type r5 = r5.getGenericComponentType()
            a(r5)
            return
        L12:
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            r1 = 0
            if (r0 == 0) goto L31
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r0 = r5.getOwnerType()
            if (r0 == 0) goto L22
            a(r0)
        L22:
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            int r0 = r5.length
        L27:
            if (r1 >= r0) goto L56
            r2 = r5[r1]
            a(r2)
            int r1 = r1 + 1
            goto L27
        L31:
            boolean r0 = r5 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L57
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r0 = r5.getLowerBounds()
            int r2 = r0.length
            r3 = r1
        L3d:
            if (r3 >= r2) goto L47
            r4 = r0[r3]
            a(r4)
            int r3 = r3 + 1
            goto L3d
        L47:
            java.lang.reflect.Type[] r5 = r5.getUpperBounds()
            int r0 = r5.length
        L4c:
            if (r1 >= r0) goto L56
            r2 = r5[r1]
            a(r2)
            int r1 = r1 + 1
            goto L4c
        L56:
            return
        L57:
            if (r5 == 0) goto L5a
            return
        L5a:
            java.lang.String r5 = "TypeToken captured `null` as type argument; probably a compiler / runtime bug"
            defpackage.i.h(r5)
            return
        L60:
            java.lang.reflect.TypeVariable r5 = (java.lang.reflect.TypeVariable) r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TypeToken type argument must not contain a type variable; captured type variable "
            r0.<init>(r1)
            java.lang.String r1 = r5.getName()
            r0.append(r1)
            java.lang.String r1 = " declared by "
            r0.append(r1)
            java.lang.reflect.GenericDeclaration r5 = r5.getGenericDeclaration()
            r0.append(r5)
            java.lang.String r5 = "typetoken-type-variable"
            java.lang.String r1 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r5 = r1.concat(r5)
            java.lang.String r1 = "\nSee "
            defpackage.fa6.g(r0, r1, r5)
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.ie7
            if (r0 == 0) goto L12
            ie7 r2 = (defpackage.ie7) r2
            java.lang.reflect.Type r2 = r2.b
            java.lang.reflect.Type r1 = r1.b
            boolean r1 = defpackage.q60.z(r1, r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.c
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.reflect.Type r0 = r0.b
            java.lang.String r0 = defpackage.q60.b0(r0)
            return r0
    }
}
