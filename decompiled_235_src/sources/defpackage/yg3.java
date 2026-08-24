package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yg3  reason: default package */
/* loaded from: classes.dex */
public final class yg3 {
    public static final HashMap b;
    public HashMap a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        try {
            hashMap.put("KeyAttribute", mg3.class.getConstructor(null));
            hashMap.put("KeyPosition", gh3.class.getConstructor(null));
            hashMap.put("KeyCycle", qg3.class.getConstructor(null));
            hashMap.put("KeyTimeCycle", ph3.class.getConstructor(null));
            hashMap.put("KeyTrigger", rh3.class.getConstructor(null));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public yg3(Context context, XmlResourceParser xmlResourceParser) {
        HashMap hashMap;
        HashMap hashMap2;
        jg3 ph3Var;
        try {
            int eventType = xmlResourceParser.getEventType();
            jg3 jg3Var = null;
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
                                    ph3Var = new ph3();
                                    break;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                            case -298435811:
                                if (name.equals("KeyAttribute")) {
                                    ph3Var = new mg3();
                                    break;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                            case 540053991:
                                if (name.equals("KeyCycle")) {
                                    ph3Var = new qg3();
                                    break;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                            case 1153397896:
                                if (name.equals("KeyPosition")) {
                                    ph3Var = new gh3();
                                    break;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                            case 1308496505:
                                if (name.equals("KeyTrigger")) {
                                    ph3Var = new rh3();
                                    break;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                            default:
                                throw new NullPointerException("Key " + name + " not found");
                        }
                        ph3Var.e(context, Xml.asAttributeSet(xmlResourceParser));
                        b(ph3Var);
                        jg3Var = ph3Var;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (jg3Var != null && (hashMap2 = jg3Var.d) != null) {
                            j11.d(context, xmlResourceParser, hashMap2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && jg3Var != null && (hashMap = jg3Var.d) != null) {
                        j11.d(context, xmlResourceParser, hashMap);
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

    public final void a(m74 m74Var) {
        boolean z;
        ArrayList arrayList = m74Var.w;
        HashMap hashMap = this.a;
        ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(m74Var.c));
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
                jg3 jg3Var = (jg3) obj;
                String str = ((o11) m74Var.b.getLayoutParams()).Y;
                String str2 = jg3Var.c;
                if (str2 != null && str != null) {
                    z = str.matches(str2);
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(jg3Var);
                }
            }
        }
    }

    public final void b(jg3 jg3Var) {
        HashMap hashMap = this.a;
        if (!hashMap.containsKey(Integer.valueOf(jg3Var.b))) {
            hashMap.put(Integer.valueOf(jg3Var.b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(jg3Var.b));
        if (arrayList != null) {
            arrayList.add(jg3Var);
        }
    }
}
