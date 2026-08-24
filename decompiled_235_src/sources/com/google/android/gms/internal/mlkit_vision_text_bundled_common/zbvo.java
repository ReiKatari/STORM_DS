package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbvo {
    private static final char[] zba;

    static {
        char[] cArr = new char[80];
        zba = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zba(zbvm zbvmVar, String str) {
        StringBuilder r = i61.r("# ", str);
        zbd(zbvmVar, r, 0);
        return r.toString();
    }

    public static void zbb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zbb(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zbb(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            zbc(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zbwj.zba(new zbtb(((String) obj).getBytes(zbuo.zba))));
                sb.append('\"');
            } else if (obj instanceof zbtc) {
                sb.append(": \"");
                sb.append(zbwj.zba((zbtc) obj));
                sb.append('\"');
            } else if (obj instanceof zbuf) {
                sb.append(" {");
                zbd((zbuf) obj, sb, i + 2);
                sb.append("\n");
                zbc(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                int i3 = i + 2;
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                zbb(sb, i3, "key", entry2.getKey());
                zbb(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                zbc(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static void zbc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zba, 0, i2);
            i -= i2;
        }
    }

    private static void zbd(zbvm zbvmVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zbvmVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zbb(sb, i, substring.substring(0, substring.length() - 4), zbuf.zbz(method2, zbvmVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zbb(sb, i, substring.substring(0, substring.length() - 3), zbuf.zbz(method, zbvmVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zbz = zbuf.zbz(method4, zbvmVar, new Object[0]);
                    if (method5 == null) {
                        if (zbz instanceof Boolean) {
                            if (!((Boolean) zbz).booleanValue()) {
                            }
                            zbb(sb, i, substring, zbz);
                        } else if (zbz instanceof Integer) {
                            if (((Integer) zbz).intValue() == 0) {
                            }
                            zbb(sb, i, substring, zbz);
                        } else if (zbz instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zbz).floatValue()) == 0) {
                            }
                            zbb(sb, i, substring, zbz);
                        } else if (zbz instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zbz).doubleValue()) == 0) {
                            }
                            zbb(sb, i, substring, zbz);
                        } else {
                            if (zbz instanceof String) {
                                equals = zbz.equals("");
                            } else if (zbz instanceof zbtc) {
                                equals = zbz.equals(zbtc.zbb);
                            } else if (zbz instanceof zbvm) {
                                if (zbz == ((zbvm) zbz).zbm()) {
                                }
                                zbb(sb, i, substring, zbz);
                            } else {
                                if ((zbz instanceof Enum) && ((Enum) zbz).ordinal() == 0) {
                                }
                                zbb(sb, i, substring, zbz);
                            }
                            if (equals) {
                            }
                            zbb(sb, i, substring, zbz);
                        }
                    } else {
                        if (!((Boolean) zbuf.zbz(method5, zbvmVar, new Object[0])).booleanValue()) {
                        }
                        zbb(sb, i, substring, zbz);
                    }
                }
            }
            i2 = 3;
        }
        if (zbvmVar instanceof zbub) {
            Iterator zbg = ((zbub) zbvmVar).zbb.zbg();
            while (zbg.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zbg.next();
                zbuc zbucVar = (zbuc) entry2.getKey();
                zbb(sb, i, "[32149011]", entry2.getValue());
            }
        }
        zbwm zbwmVar = ((zbuf) zbvmVar).zbc;
        if (zbwmVar != null) {
            zbwmVar.zbi(sb, i);
        }
    }
}
