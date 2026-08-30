package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fa3  reason: default package */
/* loaded from: classes.dex */
public final class fa3 {
    public static final HashMap b;
    public HashMap a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        try {
            hashMap.put("KeyAttribute", t93.class.getConstructor(null));
            hashMap.put("KeyPosition", oa3.class.getConstructor(null));
            hashMap.put("KeyCycle", x93.class.getConstructor(null));
            hashMap.put("KeyTimeCycle", xa3.class.getConstructor(null));
            hashMap.put("KeyTrigger", za3.class.getConstructor(null));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public fa3(Context context, XmlResourceParser xmlResourceParser) {
        HashMap hashMap;
        HashMap hashMap2;
        q93 xa3Var;
        try {
            int eventType = xmlResourceParser.getEventType();
            q93 q93Var = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    if (b.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (name.equals("KeyTimeCycle")) {
                                    xa3Var = new xa3();
                                    break;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                            case -298435811:
                                if (name.equals("KeyAttribute")) {
                                    xa3Var = new t93();
                                    break;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                            case 540053991:
                                if (name.equals("KeyCycle")) {
                                    xa3Var = new x93();
                                    break;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                            case 1153397896:
                                if (name.equals("KeyPosition")) {
                                    xa3Var = new oa3();
                                    break;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                            case 1308496505:
                                if (name.equals("KeyTrigger")) {
                                    xa3Var = new za3();
                                    break;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                            default:
                                throw new NullPointerException("Key " + name + " not found");
                        }
                        xa3Var.e(context, Xml.asAttributeSet(xmlResourceParser));
                        b(xa3Var);
                        q93Var = xa3Var;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (q93Var != null && (hashMap2 = q93Var.d) != null) {
                            ey0.d(context, xmlResourceParser, hashMap2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && q93Var != null && (hashMap = q93Var.d) != null) {
                        ey0.d(context, xmlResourceParser, hashMap);
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("KeyFrames", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("KeyFrames", "Error parsing XML resource", e2);
        }
    }

    public final void a(lz3 lz3Var) {
        boolean z;
        ArrayList arrayList = lz3Var.w;
        HashMap hashMap = this.a;
        ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(lz3Var.c));
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        ArrayList arrayList3 = (ArrayList) hashMap.get(-1);
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                q93 q93Var = (q93) obj;
                String str = ((jy0) lz3Var.b.getLayoutParams()).Y;
                String str2 = q93Var.c;
                if (str2 != null && str != null) {
                    z = str.matches(str2);
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(q93Var);
                }
            }
        }
    }

    public final void b(q93 q93Var) {
        HashMap hashMap = this.a;
        if (!hashMap.containsKey(Integer.valueOf(q93Var.b))) {
            hashMap.put(Integer.valueOf(q93Var.b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(q93Var.b));
        if (arrayList != null) {
            arrayList.add(q93Var);
        }
    }
}
