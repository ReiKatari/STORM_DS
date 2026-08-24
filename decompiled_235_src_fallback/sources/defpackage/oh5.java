package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oh5  reason: default package */
/* loaded from: classes.dex */
public abstract class oh5 {
    public static final defpackage.uj2 a = null;

    static {
            nh5 r0 = new nh5     // Catch: java.lang.ReflectiveOperationException -> L6
            r0.<init>()     // Catch: java.lang.ReflectiveOperationException -> L6
            goto Lb
        L6:
            mh5 r0 = new mh5
            r0.<init>()
        Lb:
            defpackage.oh5.a = r0
            return
    }

    public static void a(java.lang.reflect.AccessibleObject r2, java.lang.StringBuilder r3) {
            r0 = 40
            r3.append(r0)
            boolean r0 = r2 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L10
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class[] r2 = r2.getParameterTypes()
            goto L16
        L10:
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            java.lang.Class[] r2 = r2.getParameterTypes()
        L16:
            r0 = 0
        L17:
            int r1 = r2.length
            if (r0 >= r1) goto L2d
            if (r0 <= 0) goto L21
            java.lang.String r1 = ", "
            r3.append(r1)
        L21:
            r1 = r2[r0]
            java.lang.String r1 = r1.getSimpleName()
            r3.append(r1)
            int r0 = r0 + 1
            goto L17
        L2d:
            r2 = 41
            r3.append(r2)
            return
    }

    public static java.lang.String b(java.lang.reflect.Constructor r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class r1 = r2.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.<init>(r1)
            a(r2, r0)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String c(java.lang.reflect.Field r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String d(java.lang.reflect.AccessibleObject r4, boolean r5) {
            boolean r0 = r4 instanceof java.lang.reflect.Field
            java.lang.String r1 = "'"
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "field '"
            r0.<init>(r2)
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.String r4 = c(r4)
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            goto L84
        L1e:
            boolean r0 = r4 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L56
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = r4.getName()
            r0.<init>(r2)
            a(r4, r0)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "method '"
            r2.<init>(r3)
            java.lang.Class r4 = r4.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            java.lang.String r4 = "#"
            r2.append(r4)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            goto L84
        L56:
            boolean r0 = r4 instanceof java.lang.reflect.Constructor
            if (r0 == 0) goto L72
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "constructor '"
            r0.<init>(r2)
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4
            java.lang.String r4 = b(r4)
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            goto L84
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<unknown AccessibleObject> "
            r0.<init>(r1)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L84:
            if (r5 == 0) goto Lad
            r5 = 0
            char r0 = r4.charAt(r5)
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 == 0) goto Lad
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r5 = r4.charAt(r5)
            char r5 = java.lang.Character.toUpperCase(r5)
            r0.append(r5)
            r5 = 1
            java.lang.String r4 = r4.substring(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        Lad:
            return r4
    }

    public static java.lang.String e(java.lang.Exception r2) {
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "java.lang.reflect.InaccessibleObjectException"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            java.lang.String r2 = r2.getMessage()
            if (r2 == 0) goto L21
            java.lang.String r0 = "to module com.google.gson"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L21
            java.lang.String r2 = "reflection-inaccessible-to-module-gson"
            goto L23
        L21:
            java.lang.String r2 = "reflection-inaccessible"
        L23:
            java.lang.String r0 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "\nSee "
            java.lang.String r2 = r0.concat(r2)
            return r2
        L30:
            java.lang.String r2 = ""
            return r2
    }

    public static void f(java.lang.reflect.AccessibleObject r4) {
            r0 = 1
            r4.setAccessible(r0)     // Catch: java.lang.Exception -> L5
            return
        L5:
            r0 = move-exception
            r1 = 0
            java.lang.String r4 = d(r4, r1)
            ne3 r1 = new ne3
            java.lang.String r2 = "Failed making "
            java.lang.String r3 = " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."
            java.lang.StringBuilder r4 = defpackage.i61.t(r2, r4, r3)
            java.lang.String r2 = e(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4, r0)
            throw r1
    }
}
