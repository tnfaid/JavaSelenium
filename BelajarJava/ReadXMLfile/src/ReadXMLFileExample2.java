import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.sun.tools.javac.launcher.Main;

import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class ReadXMLFileExample2 {
	public static final String xmlFilePath = "/home/titik/Documents/project/JavaQA/BelajarJava/ReadXMLfile/XMLFile.xml";

	public static void main(String[] args) {
		try {

			File xmlFile = new File(xmlFilePath);

			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

			Document doc = documentBuilder.parse(xmlFile);

			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			NodeList nodeList = doc.getElementsByTagName("employee");

			System.out.println("===============================================================");

			// do this the old way, because nodeList is not iterable
			for (int itr = 0; itr < nodeList.getLength(); itr++) {

				Node node = nodeList.item(itr);

				System.out.println("\nNode Name :" + node.getNodeName());

				if (node.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) node;

					System.out.println("Employee id : " + eElement.getAttribute("id"));
					System.out.println(
							"First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println(
							"Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Email : " + eElement.getElementsByTagName("email").item(0).getTextContent());
					System.out.println(
							"Department : " + eElement.getElementsByTagName("department").item(0).getTextContent());
					System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
